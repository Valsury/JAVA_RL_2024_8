import java.util.Scanner;

public class ClientProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter three sides of the triangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();


        System.out.println("Enter color:");
        input.nextLine();
        String color = input.nextLine();


        System.out.println("Is the triangle filled? (true/false):");
        boolean isFilled = input.nextBoolean();


        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);


        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Is filled: " + triangle.isFilled());
    }
}