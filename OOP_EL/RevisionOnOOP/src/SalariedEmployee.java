public class SalariedEmployee extends Employee implements Displayable{

    double salary, bonus, deductions;

    // Constructors

    public SalariedEmployee(){

    }
// the commented is wrong since we also have to include the attributes in the super class!!!!!!
//    public SalariedEmployee(double salary){
//        this.salary = salary;
//    }
//    public SalariedEmployee(double salary, double bonus){
//        this(salary);
//        this.bonus = bonus;
//    }
//
//    public SalariedEmployee(double salary, double bonus, double deductions) {
//        this(salary, bonus);
//        this.deductions = deductions;
//    }

    public SalariedEmployee(double salary, double bonus, double deductions, String name, int ssn, String address, Gender sex){
        super(name, ssn, address, sex); // to call the constrctor from the base class
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    //Setters and getters
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }
    public double getDeductions() {
        return deductions;
    }

    // abstract method
    @Override
    public double earnings() { // no need to mention abstract again

        return ((salary + bonus) - deductions);
    }

    @Override
    public String toString(){
        return "Salaried Employee: " + salary + ", Bonus: " + bonus + ", Deductions: " + deductions;
    }

    // we need to mention the methods in the interfaces as well

        public void displayAllDetails(){
//            System.out.println("Salaried Employee Details: ");
//            System.out.println("Name: " + name);
//            System.out.println("SSN: " + SSN);
//            System.out.println("Address: " + Address);
//            System.out.println("Gender: " + sex);
//            System.out.println("Salary: " + salary);
//            System.out.println("Bonus: " + bonus);
//            System.out.println("Deductions: " + deductions);

            System.out.println(super.toString()); // to display the toString from the base class
            System.out.println(toString());


        }
        public void displayEarnings(){
        // no need since we have a method called earnings
//        System.out.println("Salary: " + salary);
//        System.out.println("Bonus: " + bonus);
//        System.out.println("Deductions: " + deductions);
//        System.out.println("Total: " + ((salary + bonus) - deductions));
            System.out.println(earnings());
        }

    }

