
enum Gender{male,female};
public abstract class Employee {

    //Attributes
     String name;
     int SSN;
     String Address;
     Gender sex;

     //Constructors
    public Employee(){
        name = "No name";
        SSN = 0;
        Address = "No address";
        sex = Gender.male;
    }
    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, int SSN){
        this.name = name;
        this.SSN = SSN;
    }
    public Employee(String name, int SSN, String Address){
        this.name = name;
        this.SSN = SSN;
        this.Address = Address;
    }

    // Setters and getters
    public void SetName(String name) {
        this.name = name;
    }

    public String getName() { // String to mention the return type
        return name;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    public int getSSN() {
        return SSN;
    }
    public void Gender(Gender sex) {
        this.sex = sex;
    }
    //Abstract method
    public abstract double Earning();

}
