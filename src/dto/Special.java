package dto;

public class Special {
    private String id; //auto generated
    private String dealerID;  // who is giving such special offer.
    private String startDate; // by default it's today
    private String endDate;
    private String title;
    private String description;
    private String disclaimer;
    private String value;
    private SpecialScope scope;
    private String specialParameter;


    public Special(String dealerID, String endDate, String title, String value, SpecialScope scope, String specialParameter) {

        this.dealerID = dealerID;
        this.endDate = endDate;
        this.title = title;
        this.value = value;
        this.specialParameter = specialParameter;
        this.scope = scope;
    }

    public String getId() {
        return id;
    }

    public String getDealerID() {
        return dealerID;
    }

    public void setDealerID(String dealerID) { this.dealerID = dealerID; }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SpecialScope getScope() { return scope; }

    public void setScope(SpecialScope scope){ this.scope = scope; }

    public String getSpecialParameter(){ return specialParameter;    }

    public void setSpecialParameter(String specialParameter){ this.specialParameter = specialParameter;}
}
