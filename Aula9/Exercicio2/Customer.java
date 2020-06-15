public class Customer {

    //Attributes
    protected String customerID;
    protected String name;
    protected String profession;
    
    
    //Getters
    public String getCustomerID() {
        return this.customerID;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getProfession() {
        return this.profession;
    }
    
    
    //Setters
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setProfession(String profession) {
        this.profession = profession;
    }
}