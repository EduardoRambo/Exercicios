public class Apple extends Fruit{

    @Override
    public String eat() {
        return "I'm eating an apple";
    }
    
    @Override
    public String peelFruit(){
        return "Use a knife";
    }
    
    @Override
    public String toString() {
        return "Color: " + this.color
             + "\nEating: " + this.eat()
             + "\nPeel: " + this.peelFruit();
    }
}