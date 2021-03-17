import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todo;

    public TodoList(){
        this.todo = new ArrayList<>();
    }

    public void add(String str){
        todo.add(str);
    }

    public void print(){
        int i = 0;
        for (String d : todo){
            System.out.println(i + ", " + d);
        }
    }

    public void remove(int num){
        todo.remove(num);
    }
}
