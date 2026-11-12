import java.util.ArrayList;
class Main{
    public static void main(String[]args){
        ArrayList<Integer> obj =new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        System.out.println(obj);
    }
}





import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Ravi");
        names.add("Kiran");
        names.add("Rahul");
        names.add("Amit");

        // Print ArrayList
        System.out.println(names);

        // Get element
        System.out.println("First Name: " + names.get(0));

        // Update element
        names.set(1, "Arjun");

        // Remove element
        names.remove("Rahul");

        // Print updated list
        System.out.println("Updated List: " + names);

        // Find size
        System.out.println("Size: " + names.size());

        // Loop ArrayList
        for (String name : names) {
            System.out.println(name);
        }
    }
}
