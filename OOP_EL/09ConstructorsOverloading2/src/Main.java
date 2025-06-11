public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee(150, "Malek", false);
        e1.print_emp_data();

        Employee e2 = new Employee(151, "Arios", "Marketing", 3100, 600, true);
        e2.print_emp_data();

        e2.set_Salary(5000, 500);
        e2.print_emp_data();

    }
}
