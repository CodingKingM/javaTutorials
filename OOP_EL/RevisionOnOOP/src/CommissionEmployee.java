import java.lang.classfile.attribute.CompilationIDAttribute;

public class CommissionEmployee extends Employee implements Displayable{

    double grossSales;
    double commissionRate;

    // Constrctor
     public CommissionEmployee (){}

    public CommissionEmployee(String name, int ssn, String address, double grossSales, double commissionRate){
         super(name, ssn, address);
         this.grossSales = grossSales;
         this.commissionRate = commissionRate;
    }

    // Setters and getters

    public void setGrossSales(double grossSales){
         this.grossSales = grossSales;
    }
    public double getGrossSales(){
         return grossSales;
    }
    public void setCommissionRate(double commissionRate){
         this.commissionRate = commissionRate;
    }
    public double getCommissionRate(){
         return commissionRate;
    }

    @Override
    public String toString(){
         return "Gross Sales= " + grossSales + "Commission rate= " + commissionRate;
    }
    // abstract method
    @Override
    public double earnings(){
         return grossSales  * commissionRate;
    }

    // Interface methods
     public void displayAllDetails(){
         System.out.println(super.toString());
         System.out.println(toString());
     }
     public void displayEarnings(){
         System.out.println(earnings());
     }


}
