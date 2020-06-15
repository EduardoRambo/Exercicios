public class Employee extends Person {
        
    protected int registerNumber;
    protected double workedHours;
    protected double workedHourValue;
      
    //Getters
    
    public int getRegisterNumber() {
        return this.registerNumber;
    }
    
    public double getWorkedHours() { 
        return this.workedHours;
    }
    
    public double getWorkedHourValue() {
        return this.workedHourValue;
    }
    
    
    //Setters
    
    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }
    
    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }
    
    public void setWorkedHourValue(double workedHourValue) {
        this.workedHourValue = workedHourValue;
    }
    
    
    //Methods 
    
    public double calculateGrossSalary() {
        return this.workedHours * this.workedHourValue;
    }
    
    public double calculateFGTS() {
        if (calculateGrossSalary()<=1087) {
            return calculateGrossSalary() * 0.08;
        } else 
        if (calculateGrossSalary()>1087 || calculateGrossSalary()<=3040){
            return calculateGrossSalary() * 0.09;
        } else 
            return calculateGrossSalary() * 0.10;        
    }
}
