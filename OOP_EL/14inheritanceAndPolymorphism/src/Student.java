public class Student extends Person {

    // Study level, specialisation GPA

     int studyLevel;
     String specialization;
     double gpa;

     //Constructors
    public Student(){
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







}
