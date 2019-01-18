import model.*;

public class Main {
    public static void main(String[] args){

        Figure square = new Square(5);
        System.out.println("Pole kwadratu wynosi: " + square.getArea());
        System.out.println("Obwód kwadratu wynosi: " + square.getCircuit());

        Figure rhombus = new Rhombus(3, 5);
        System.out.println("Pole rombu wynosi: " + rhombus.getArea());
        System.out.println("Obwód rombu wynosi: " + rhombus.getCircuit());

        Figure triangle = new Triangle(3, 3, 3);
        System.out.println("Pole trójkąta wynosi: " + triangle.getArea());
        System.out.println("Obwód trójkąta wynosi: " + triangle.getCircuit());

        Figure rectangle = new Rectangle(3, 3);
        System.out.println("Pole prostokąta wynosi: " + rectangle.getArea());
        System.out.println("Obwód prostokąta wynosi: " + rectangle.getCircuit());

    }
}
