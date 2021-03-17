import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckNamesCSV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of CSV file?");
        String file = scan.nextLine();
	try (Scanner scanner = new Scanner(Paths.get(file))){
	    while (scanner.hasNextLine()){
	        String[] person = scanner.nextLine().split(",");
            System.out.println(person[0] + ", age: " + person[1] + " years");
        }
    } catch (Exception e){
        System.out.println(e);
    }

}
}
