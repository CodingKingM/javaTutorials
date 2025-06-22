public class Person {
    //instance variables
    private String name;
    private int age;
    private String address;
    private String nationality;

    //Constructors
    public Person(){

    }
    public Person(String name, int age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }
    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    //Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getNationality(){
        return nationality;
    }




}


