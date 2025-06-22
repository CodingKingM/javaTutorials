public class Student extends Person {

    // Study level, specialisation GPA

     int studyLevel;
     String specialization;
     double gpa;

     //Constructors
    public Student(){
    }

    public Student(String name, int age, String address, String nationality, int studyLevel, String specialization, double gpa) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
        this.studyLevel = studyLevel;
        this.specialization = specialization;
        this.gpa = gpa;
    }




}
