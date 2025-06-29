enum Gender {Male, Female}
enum Course {ICS,IME,IM,MB};
enum Semester {Winter, Summer};

public class RegisterForm {

    String StdName;
    Gender StdGender;
    Course StdCourse;
    Semester StdSemester;

    // Constructor

    public RegisterForm(){
        StdName = "No name";
        StdGender = Gender.Male; // first we write the name of the enum then fullstop . and possible enums
        StdCourse = Course.ICS;
        StdSemester = Semester.Winter;
    }

}
