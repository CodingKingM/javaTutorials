public class Employee {

    private int emp_Id;
    private String emp_Name;
    private String department;
    private double salary;
    private double bonus;
    private boolean resident;

    public Employee() { //default values
        emp_Id = 100;
        emp_Name = "No name";
        department = "Has not been assigned yet";
        salary = 3000;
        bonus = 500;
        resident = false;
    }

    public Employee(int id, String name){
        emp_Id = id;
        emp_Name = name;
    }

    public Employee(int id, String name, boolean resi){ //constructor overloading by changing the signature from previous one
        // emp_Id = id;
        // emp_Name = name;
        this (id, name);
        resident = resi;
    }

    public Employee(int id, String name, String dept, double sal, double bon, boolean res){
        this (id, name, res);
        department = dept;
        salary = sal;
        bonus = bon;

    }
    public void print_emp_data(){
        System.out.println("Employee ID: " + emp_Id);
        System.out.println("Employee Name: " + emp_Name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Resident: " + resident);
        // instead of void it could have been written: return "Employee ID: " + emp_id + ...
    }

    public void set_Salary(double sal){ //double sal is the data type to accept that the user will input
        salary = sal;
    }

    public void set_Salary(double sal, double bon){
        this.set_Salary(sal);
        bonus = bon;
    }


}
