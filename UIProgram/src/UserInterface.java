import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private TodoList todo;

    public UserInterface(Scanner scanner, TodoList todo){
        this.scanner = scanner;
        this.todo = todo;
    }

    public void start(){
        while (true){
            System.out.println("Command");
            String word = scanner.nextLine();

            if (word.equals("add")){
                System.out.println("Enter word to add");
                String adder = scanner.nextLine();
                todo.add(adder);
            } else if (word.equals("remove")){
                System.out.println("Which index to remove?");
                int n = Integer.valueOf(scanner.nextLine());
                todo.remove(n);
            } else if (word.equals("list")){
                todo.print();
            }
        }
    }
}
