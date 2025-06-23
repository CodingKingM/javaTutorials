public class Main {

    public static void main(String[] args) {

        Student std1 = new Student("Malek", 20, "Germany", "German", 5, "ICS", 4.5);
        System.out.println(std1.getName());
        System.out.println(std1.getAge());

        std1.printPerson(); // to print out the details

        Student std2 = new Student();


    }
}
