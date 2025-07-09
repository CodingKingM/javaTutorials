import java.util.ArrayList;

public class Department {

    int dno;
    String dname;
    ArrayList<Employee> empList; // = new ArrayList<>(); we will initialize it later

    public Department(){

    }
    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        empList = new ArrayList<>(); // we initialised the ArrayList HERE
    }

    // setters and getts
    public void setDno(int dno) {
        this.dno = dno;
    }
    public int getDno() {
        return dno;
    }
    public void setdname(String dname) {
        this.dname = dname;
    }
    public String getdname() {
        return dname;
    }
    public void addEmployee(Employee emp) { //Employee is the type
        empList.add(emp); // employee name
    }
    public void removeEmployee(int idx) { //it justs needs the index of the employee to remove
        empList.remove(idx); //index number is needed
    }
    public int getEmployeeCount() {
        return empList.size();
    }
    public void printBasicData() {
        for (int i = 0; i<empList.size();i++) {
            System.out.println(empList.get(i).getSnn() + "" + empList.get(i).getName() + "");
        }
    }
    public void PrintAllDetails(){
        for (int i = 0; i<empList.size();i++) {
            if (empList.get(i) instanceof SalariedEmployee) {
                ((SalariedEmployee) empList.get(i)).displayAllDetails();
            }
            if (empList.get(i) instanceof CommissionEmployee) {
                ((CommissionEmployee) empList.get(i)).displayAllDetails();
            }
            if(empList.get(i) instanceof HourlyEmployee) {
                ((HourlyEmployee) empList.get(i)).displayAllDetails();
            }
        }
    }



}
