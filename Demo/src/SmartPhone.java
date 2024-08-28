public class SmartPhone {


        public String brand;
        public String model;
        public int storage; // in GB
        public boolean is5GEnabled;


        public SmartPhone() {

            System.out.println("Constructor is created");
        }


        public void displayDetails() {
            System.out.println("Display details is ruuning in Smartphone");

        }

        public void makeCall(String phoneNumber) {
            System.out.println("Makecall is ruuning in Smartphone");
        }

}
