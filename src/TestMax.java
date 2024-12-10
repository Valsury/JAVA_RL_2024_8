import java.util.ArrayList;
import java.util.Scanner;

public class TestMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (enter 0 to stop):");
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }
        Integer result = max(list);
        if (result == null) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The maximum value is: " + result);
        }
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        Integer max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}