public class Main {

    public static void main(String[] args) {
//        Salaried_Employee se1 = new Salaried_Employee("Malek", 21, "Germany", "German", 2500, "Manager", "IT", 500, 100);
//        se1.get_salary();
//        System.out.println(se1.get_salary()); //uses the get_Salary method in Salaried_Employee and overrides/ignores the Employee one

//        Employee e1 = new Employee("Malek", 21, "Germany", "German", 2500, "Manager", "IT");
//        e1.printPerson();

        Employee e1 = new Employee("Malek", 21, "Germany", "German", 2500, "Manager", "IT");
        Employee e2 = new Salaried_Employee("Malek", 21, "Germany", "German", 2500, "Manager", "IT", 500, 100);

        System.out.println(e1.get_salary());
        System.out.println(e2.get_salary());

    }
}
