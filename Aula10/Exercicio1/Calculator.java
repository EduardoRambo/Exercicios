public class Calculator implements CalculatorInterface {

    //Attributes
    private double numberOne;
    private double numberTwo;
    
    public Calculator() {   
    }
    
    
    
    //Getters
    @Override 
    public double getNumberOne() {
        return this.numberOne;
    }
   
    @Override 
    public double getNumberTwo() {
        return this.numberTwo;
    }
    
    
    //Setters
    @Override 
    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }
   
    @Override 
    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }
    
    @Override
    public double addition() {
        return this.numberOne + this.numberTwo;
    }
    
    @Override
    public double subtraction() {
        return this.numberOne - this.numberTwo;
    }
    
    @Override
    public double multiplication() {
        return this.numberOne * this.numberTwo;
    }
    
    @Override
    public double division() {
        return this.numberOne / this.numberTwo;
    }
    
    @Override
    public String toString() {
        return "Thats calculator toString"
             + "\nNumber one: " + this.numberOne
             + "\nNumber Two: " + this.numberTwo
             + "\nAddition: " + this.addition()
             + "\nSubtraction: " + this.subtraction()
             + "\nMultiplication: " + this.multiplication()
             + "\nDivision: " + this.division();
    }
}