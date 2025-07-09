import java.lang.classfile.attribute.CompilationIDAttribute;

public class Main {

    public static void main(String[] args) {

        Department d1 = new Department(1, "Computer Science");

        SalariedEmployee se1 = new SalariedEmployee(2000, 200, 50, "Malek", 123, "Germany", Gender.male );

        d1.addEmployee(se1);

        HourlyEmployee he1 = new HourlyEmployee(17, 35, "Arios", 144, "Albania");

        d1.addEmployee(he1); // calls the addEmployee method in d1 (Department)

        CommissionEmployee ce1 = new CommissionEmployee(1500, 0.25, "Ali", 167, "Morocco");

        d1.addEmployee(ce1);

        System.out.println(d1.getEmployeeCount()); // calls and then prints the method from Department empList.size();

        //d1.printBasicData();
        d1.printAllDetails();



    }
}
