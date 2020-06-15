public class Teacher extends Employee {
    
    //Constructor
    
    public Teacher(String name, String surname, String email, String birthdate, int registerNumber, double workedHours, double workedHourValue) {
       this.name = name;   
       this.surname = surname;
       this.email = email;
       this.birthdate = birthdate; 
       this.registerNumber = registerNumber;
       this.workedHours = workedHours;
       this.workedHourValue = workedHourValue;
    }
        
    @Override
    public String toString() {        
        return "That's toString Teacher"
             + "\nName: " + this.name
             + "\nSurname: " + this.surname
             + "\nEmail: " + this.email
             + "\nBirthdate: " + this.birthdate
             + "\nRegister Number: " + this.getRegisterNumber()
             + "\nWorked Hours: " + this.getWorkedHours()
             + "\nValue per Hour worked: " + this.getWorkedHourValue()
             + "\nGross Salary: " + this.calculateGrossSalary()
             + "\nFGTS: " + this.calculateFGTS()
             + "\n";      
    }
}