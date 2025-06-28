public class Salaried_Employee extends Employee {
    double bonus;
    double deduction;

    //Constructor
    public Salaried_Employee(){
        bonus = 0;
        deduction = 0;
    }
    public Salaried_Employee(String name, int age, String address, String nationality, double salary, String rank, String job, double bonus, double deduction) {
        super(name, age, address, nationality, salary, rank, job);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    @Override //override the get_salary method in the base class ( EMPLOYEE.JAVA)
    public double get_salary(){
        return salary + bonus - deduction;
    }

    @Override
    public void printPerson(){
        super.printPerson(); // calls the printPerson method from Person.java and fills out the data
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
    }



}
