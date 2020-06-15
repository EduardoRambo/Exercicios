public class Person {
    
    //Attributes
    protected String name;
    protected String surname;
    protected String email;
    protected String birthdate;
    
    
    //Getters
    
    public String getName() {
        return this.name;
    }
    
    public String getSurname() {
        return this.surname;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getBirthdate() {
        return this.birthdate;
    }
    
    
    //Setters 
    
    public void setName(String name) {
        this.name = name;    
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setEmail(String email) {
        this.email = email;        
    }
    
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
  
}