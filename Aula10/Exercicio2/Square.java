public class Square implements GeometricFigure {
    
    private double sideLength;

    
    public Square(){
    }
    
    @Override
    public double getSideLength() {
        return this.sideLength;
    }
    
    @Override
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    
    public String figureName() {
        return "Square";
    }
    
    @Override
    public double area() {
        return this.sideLength * this.sideLength;
    }
    
    @Override
    public double perimeter() {
        return sideLength * 4;
    }
    
    @Override
    public String toString() {
        return "Thats Square toString"
             + "\nSide Length: " + this.sideLength
             + "\nFigure:  " + this.figureName()
             + "\nArea Length: " + this.area()
             + "\nPerimeter Length: " + this.perimeter();
    }
}
