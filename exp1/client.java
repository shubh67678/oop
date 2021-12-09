import java.util.*;
import java.io.FileWriter; 
import java.io.BufferedReader;
import java.io.FileReader; 
public class client {
    public static void main(String [] args)

	{
        Scanner scanner_obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input the number of items you want");
        int number_of_inputs = scanner_obj.nextInt();
        String waste = scanner_obj.nextLine();
        String arr[] = new String[number_of_inputs];
        
        System.out.println("Enter the items " + number_of_inputs);

        for (int i = 0; i < number_of_inputs; i++) {
            arr[i] = scanner_obj.nextLine();
        }
        scanner_obj.close();
        try
        {
            FileWriter fw = new FileWriter("text_file.txt");
            for (int i = 0; i < number_of_inputs; i++) {
                String textIn = arr[i];
                fw.write(textIn + "\n");    
            }
            fw.close();    
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Done");
        }
        System.out.println('\n');
        try
        {
            String file_loc = "text_file.txt";
            BufferedReader buffer_read = new BufferedReader(new FileReader(file_loc));
            String text_doc_string;
            System.out.println("The order we go!\n");

            while ((text_doc_string = buffer_read.readLine()) != null)
                System.out.println(text_doc_string);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Done");
        }
        
    }
}
