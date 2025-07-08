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




}
