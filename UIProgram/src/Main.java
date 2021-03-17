import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todo = new TodoList();
        UserInterface UI = new UserInterface(scanner, todo);
        UI.start();
    }
}
