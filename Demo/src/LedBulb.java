public class LedBulb {

    public class LedBulb extends Bulb {

        LedBulb()
        {
            System.out.println("Created construcctor  with nno argument");
        }


        public static void main(String[] args) {
            LedBulb ledBulb1=new LedBulb();
            ledBulb1.color="White";
            System.out.println("Color:"+ledBulb1.color);
            ledBulb1.purchase();
        }
}
