public class Student extends Person {

    //Attributes
    private double gradeOne;
    private double gradeTwo;
    
    public Student(String name, String surname, String email, String birthdate, int gradeOne, int gradeTwo) {
       this.name = name;   
       this.surname = surname;
       this.email = email;
       this.birthdate = birthdate; 
       this.gradeOne = gradeOne;
       this.gradeTwo = gradeTwo;
    }
  
    
    //Getters 
    public double getGradeOne() {
       return this.gradeOne;
    }
    
    public double getGradeTwo() {
       return this.gradeTwo;
    }
    
    
    //Setters
    public void setGradeOne(double gradeOne) {
       this.gradeOne = gradeOne;
    }
    
    public void setGradeTwo(double gradeTwo) {
       this.gradeTwo = gradeTwo;
    }
   
    
    //Methods
    
    public double calculateArithmeticAverage() {
       return (this.gradeOne + this.gradeTwo) / 2;
    }

    
    @Override
    public String toString() {        
        return "That's toString Student"
        + "\nName: " + this.name
        + "\nSurname: " + this.surname
        + "\nEmail: " + this.email
        + "\nBirthdate: " + this.birthdate
        + "\nGrade One: " + this.gradeOne
        + "\nGrade Two: " + this.gradeTwo
        + "\nFinal Grade: " + this.calculateArithmeticAverage()
        + "\n";
    }
}