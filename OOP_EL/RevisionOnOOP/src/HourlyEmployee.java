public class HourlyEmployee extends Employee implements Displayable {

        double hourlyRate;
        int numberOfHours;

        //Constructors
        public HourlyEmployee(){
        }

        public HourlyEmployee(String name, int ssn, String address, double hourlyRate, int numberOfHours) {
            super(name, ssn, address);
            this.hourlyRate = hourlyRate;
            this.numberOfHours = numberOfHours;
        }

        // setters and getters
        public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }
        public double getHourlyRate() {
            return hourlyRate;
        }
        public void setNumberOfHours(int numberOfHours) {
            this.numberOfHours = numberOfHours;
        }
        public int getNumberOfHours() {
            return numberOfHours;
        }

        @Override
        public String toString() {
            return "Hourly rate= " + hourlyRate + "Number of hours= " + numberOfHours;
        }

        // Abstract method
        @Override
        public double earnings(){
            return hourlyRate * numberOfHours;
        }

        // Interface methods
        public void displayAllDetails() {
            System.out.println(super.toString());
            System.out.println(toString());
        }

        public void displayEarnings() {
            System.out.println(earnings());
        }





}
