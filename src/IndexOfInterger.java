import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInterger {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter some integers. Enter 0 when you are done entering numbers.");
        Integer response = input.nextInt();
        
        while(!response.equals(0)){
            list.add(response);
            response = input.nextInt();
        }

        System.out.println("Done entering integers into the list.");
        System.out.println("What number are you looking for in the list?");

        Integer search = input.nextInt();

        System.out.println(search + " is at index " + list.indexOf(search));

        input.close();

    }
}