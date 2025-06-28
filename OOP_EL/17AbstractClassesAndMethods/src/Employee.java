public abstract class Employee {

    String name;
    int age;
    double salary;
    String rank;
    String job;

    //constructors
    public Employee() {
    }
    public Employee(String name, int age, String address, String nationality, double salary, String rank, String job) {

        this.name = name;
        this.age = age;
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
    public abstract double get_salary(); // get_salary is abstracted means every sub class HAS to override it

    public String get_rank() {
        return rank;
    }
    public String get_job() {
        return job;
    }


    public void printPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + get_salary());
        System.out.println("Rank: " + get_rank());
        System.out.println("Job: " + get_job());
    }


}
