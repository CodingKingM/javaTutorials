public class Student extends Person {

    // Study level, specialisation, GPA

     int studyLevel;
     String specialization;
     double gpa;

     //Constructors
    public Student(){
        System.out.println("I am the Derived/sub class constructor ");
    }

    // instead of rewriting the code in the super class contructor we use the keyword SUPER
    public Student(String name, int age, String address, String nationality, int studyLevel, String specialization, double gpa) {
        super(name, age, address, nationality);// to call the super constructor of the superclass, we pass the value of attributes in base class
        this.studyLevel = studyLevel;
        this.specialization = specialization;
        this.gpa = gpa;
    }

    //Setters
    public void setStudyLevel(int studyLevel) {
        this.studyLevel = studyLevel;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Getters
    public int getStudyLevel() {
        return studyLevel;
    }
    public double getGpa() {
        return gpa;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void printPerson(){
        super.printPerson(); // calls Person's printPerson METHOD...to inherit whats written in printPerson from Person class
        System.out.println("Study level: " + studyLevel);
        System.out.println("Specialization: " + specialization);
        System.out.println("GPA: " + gpa);

    }







}
