public class Person {
    //instance variables
    String name;
    int age;
    String address;
    String nationality;

    //Constructors
    public Person(){

        System.out.println("I am the superclass constructor ");

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

    public void printPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Nationality: " + nationality);
    }





}


