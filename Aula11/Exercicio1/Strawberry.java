public class Strawberry extends Fruit{

    @Override
    public String eat() {
        return "I'm eating a Strawberry";
    }
    
    @Override
    public String peelFruit(){
        return "Does it really need?";
    }
    
    @Override
    public String toString() {
        return "Color: " + this.color
             + "\nEating: " + this.eat()
             + "\nPeel: " + this.peelFruit();
    }
}