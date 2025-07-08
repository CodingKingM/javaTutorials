public class BasePlusCommissionEmployee extends CommissionEmployee {

    double base; //base salary

    // constructor
    public BasePlusCommissionEmployee(){
    }

    public BasePlusCommissionEmployee(String name, int ssn, String address, double grossSales, double comissionRate, double base ){
        //super(name, ssn, address); //doesnt work as its trying to call a constructor in Comission Employee but it doesnt exist
        super(name, ssn, address, grossSales, comissionRate); // would work since CommissionEmployee is the super class of basePlusComission and has the constructor signature
        this.base = base;
    }

    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }

    @Override
    public String toString(){
        return super.toString()+" base: "+base; // calls the toString method in CommissionEmployee as CommissionEmployee is the super class of BasePlusComissionEmployee
    }

    //Abstract method from Employee
    @Override
    public double earnings (){
        return super.earnings() + base; //calls the earnings method from CommissionEmployee and adds the base salary on top of it
    }
    // Interface methods
    public void displayAllDetails(){
    super.displayAllDetails();
    //System.out.println("base salary" + base); // instead we can use
        displayEarnings();
    }
    public void displayEarnings(){
        super.displayEarnings(); //since earnings is overridden in BaseClass it will use its earnings and not the one from CommissionEmployee but will use its method

    }


}
