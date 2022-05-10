import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter at least 5 intergers; Enter 0 when you are done entering integers.");
        

        while (true) {
            Integer response = Integer.parseInt(input.nextLine());

            if (response == 0) {
                break;

            } else {
                list.add(response);
                
            }
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + ", ");

        }

        System.out.println("were the integers in the list. " + "The sum of that list is " + "\n" + Sum(list));
        input.close();

    }

    public static int Sum(ArrayList<Integer> item) {

        int sum = 0;

        for (int digit : item) {
            sum += digit;
        }

        return sum;
    }
}