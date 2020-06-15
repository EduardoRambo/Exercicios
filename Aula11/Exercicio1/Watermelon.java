public class Watermelon extends Fruit{

    @Override
    public String eat() {
        return "I'm eating a watermelon";
    }
    
    @Override
    public String peelFruit(){
        return "Use a Knife";
    }
    
    @Override
    public String toString() {
        return "Color: " + this.color
             + "\nEating: " + this.eat()
             + "\nPeel: " + this.peelFruit();
    }
}