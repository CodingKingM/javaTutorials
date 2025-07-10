public abstract class Employee {

    //Attributes
     String name;
     int ssn;
     String address;
      Gender sex;

     //Constructors
    public Employee(){
        name = "No name";
        ssn = 0;
        address = "No address";
        sex = Gender.male;
    }
    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, int ssn){
        this(name);
        this.ssn = ssn;
    }
    public Employee(String name, int ssn, String address){
        this(name, ssn);
        this.address = address  ;
    }
    public Employee(String name, int ssn, String address, Gender sex){
        this(name, ssn, address);
        this.sex = sex;
    }

    // Setters and getters
    public void SetName(String name) {
        this.name = name;
    }

    public String getName() { // String to mention the return type
        return name;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public int getSsn() {
        return ssn;
    }
    public void Gender(Gender sex) {
        this.sex = sex;
    }
    public Gender getGender() {
        return sex;
    }

    //Abstract method
    public abstract double earnings(); // we odnt @override because we are declaring a new method, we are not implementing or overriding

    @Override // since we are inheriting a mehtod from java.lang.Object
    public String toString() {
        return "Employee: " + "name: " + name + ", Snn: " + ssn + ", Address: " + address;
    }

}
