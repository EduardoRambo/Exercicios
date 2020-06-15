import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    
    System.out.println("\f");
    
    Scanner scanner = new Scanner(System.in);
    
    Apple apple = new Apple();
    System.out.println("Type the color of the Apple: ");
    apple.setColor(scanner.next());
    System.out.println(apple);
    
    Strawberry strawberry = new Strawberry();
    System.out.println("Type the color of the strawberry: ");
    strawberry.setColor(scanner.next());
    System.out.println(strawberry);
    
    Watermelon watermelon = new Watermelon();
    System.out.println("Type the color of the watermelon: ");
    strawberry.setColor(scanner.next());
    System.out.println(watermelon);
    
    }
}