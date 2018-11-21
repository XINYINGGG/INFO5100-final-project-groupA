package service;

import dao.VehicleQuery;
import dto.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.*;

public class VehicleListPage {

    List<Vehicle> vehicles;
    VehicleFilterSelected parameter;
    int pageCount;
    VehicleQuery vq;

    public VehicleListPage(){

        try {
            this.vq = new VehicleQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Query(VehicleFilterSelected parameter) {

        this.parameter = parameter;
        try {
            vq.Query(parameter);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<List<ImageIcon>> getImages() {

        List<List<ImageIcon>> res = new ArrayList<>();
        ImageIcon noIMG;
        try {
            noIMG = new ImageIcon(ImageIO.read( new File("/Users/aaron/NeuHomeWork5100/INFO5100-final-project-groupA/src/dto/noImage.jpg")));
        } catch (IOException e) {
            e.printStackTrace();
            return res;
        }

        for (Vehicle v : vehicles) {
            List<ImageIcon> list = new ArrayList<>();
            for (String link : v.getImages()) {
                ImageIcon icon;
                try {
                    URL url = new URL(link);
                    icon = new ImageIcon(ImageIO.read(url));
                } catch (IOException e) {
                    icon = noIMG;
                }
                list.add(icon);
            }
            res.add(new ArrayList<>(list));
        }

        return res;
    }


    public VehicleFilterContent getFilterContent() {
        return vq.getVehicleFilterContent();
    }

    public List<Vehicle> getVehicleList() {
        return vq.getVehicles();
    }

    public int getPageCount(){
        return vq.getPageCount();
    }

}