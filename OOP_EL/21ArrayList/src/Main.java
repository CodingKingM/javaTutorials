import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    ArrayList<String> nameList = new ArrayList<>(); // () set automatically to 10
        nameList.add("malek");
        nameList.add("Alex");
        System.out.println(nameList);
        System.out.println("the Array list size is " + nameList.size());
        System.out.println(nameList.get(0));
        System.out.println(nameList.get(1));
        nameList.add(1,"Bob"); // adds an item at a specific index (it doesn't replace the existing one)
        System.out.println(nameList);
        System.out.println(nameList.get(2)); // ArrayList dynamically adds a new one
        nameList.set(2, "Arios");
        System.out.println(nameList);
        nameList.remove(1);
        System.out.println(nameList);
        System.out.println(nameList.size());
    }
}
