
public class JuridicalPerson extends Customer {
    
    //Attributes
    private String companyName;
    private String cnpj;
    private String stateRegistration;
    private double startCapital;
       
    
    //Constructor
    
    public JuridicalPerson(String customerID, String name, String profession, String companyName, String cnpj, String stateRegistration, double StartCapital) {
        this.customerID = customerID;
        this.name = name;
        this.profession = profession;
        this.companyName = companyName;
        this.cnpj = cnpj;
        this.stateRegistration = stateRegistration;
        this.startCapital = startCapital;
    }
    

    //Getters
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public String getCNPJ() {
        return this.cnpj;       
    }
    
    public String getStateRegistration() {
        return this.stateRegistration;
    }
    
    public double getStartCapital() {
        return this.startCapital;
    }
    
    
    //Setters  
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }
    
    public void setStartCapital(double startCapital) {
        this.startCapital = startCapital;
    }
    
    @Override
    public String toString() {
        return "That's toString JuridicalPerson"
             + "\nCustomer ID: " + this.customerID
             + "\nName(Enterprise): " + this.name 
             + "\nProfession: " + this.profession
             + "\nCompany Name: " + this.companyName
             + "\nCNPJ: " + this.cnpj
             + "\nState Registration: " + this.stateRegistration
             + "\nStart Capital: " +this.startCapital
             + "\n";
        
    }
}