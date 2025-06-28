public class Employee extends Person {

    double salary;
    String rank;
    String job;

    //constructors
    public Employee() {
        super();
        salary = 0.0;
        rank = "";
        job = "";
    }
    public Employee(String name, int age, String address, String nationality, double salary, String rank, String job) {
        super(name, age, address, nationality);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }
    //Setters
    public void set_salary(double salary) {
        this.salary = salary;
    }
    public void set_rank(String rank) {
        this.rank = rank;
    }
    public void set_job(String job) {
        this.job = job;
    }
    // Getters
    public double get_salary() {
        return salary;
    }
    public String get_rank() {
        return rank;
    }
    public String get_job() {
        return job;
    }

    @Override
    public void printPerson(){
        super.printPerson(); // calls the printPerson method from Person.java and fills out the data
        System.out.println("Salary: " + get_salary());
        System.out.println("Rank: " + get_rank());
        System.out.println("Job: " + get_job());
    }


}
