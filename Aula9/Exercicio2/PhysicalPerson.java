public class PhysicalPerson extends Customer{
    
    //Attributes
    private String maritalStatus;
    private String cpf;
    private String birthdate; 

    
    //Constructor
    public PhysicalPerson(String customerID, String name, String profession, String maritalStatus, String cpf, String birthdate) {
        this.customerID = customerID;
        this.name = name;
        this.profession = profession;
        this.maritalStatus = maritalStatus;
        this.cpf = cpf;
        this.birthdate = birthdate;
    }
    
    
    //Getters
    
    public String getMaritalStatus() {
        return this.maritalStatus;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
    public String getBirthdate() {
        return this.birthdate;
    }
    
    
    //Setters 
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    public void setCPF(String CPF) {
        this.cpf = cpf;
    }
   
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }   
    
    @Override
    public String toString() { 
    return "That's toString Physical Person" 
         + "\nCustomer ID: " + this.customerID
         + "\nName: " + this.name 
         + "\nProfession: " + this.profession
         + "\nMarital Status: " +this.maritalStatus
         + "\nCPF : " + this.cpf
         + "\nBirthdate: " + this.birthdate
         + "\n";
    }
}