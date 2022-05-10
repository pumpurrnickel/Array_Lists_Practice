import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Enter at least 5 strings; Input nothing to end the program.");
        String response = input.nextLine();
        
        while(!response.isBlank()){
            list.add(response);
            response = input.nextLine();
        }

        int last = list.size()-1;
        System.out.println("The last item in this list is: " + list.get(last));

        input.close();

    }
}