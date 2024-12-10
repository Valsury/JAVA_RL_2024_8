import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        Triangle triangle = new Triangle(3, 4, 5);
        list.add(triangle);

        Date date = new Date();
        list.add(date);

        String str = "Hello, World!";
        list.add(str);

        Circle circle = new Circle(2.5);
        list.add(circle);

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}