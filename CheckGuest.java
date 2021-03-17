import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("What file should be checked?");
        String file = scan.nextLine();
	try (Scanner scanner = new Scanner(Paths.get(file))){
	    while (scanner.hasNextLine()){
	        arr.add(scanner.nextLine());
        }
    } catch (Exception e){
        System.out.println(e);
    }
        while (true){
            System.out.println("Enter name:");
            String name = scan.nextLine();
            if (arr.contains(name)){
                System.out.println("Name on list");
            } else if (!arr.contains(name)){
                System.out.println("Not on list");
            } else if (name.equals("")){
                break;
            }
        }
    scan.close();
}
}
