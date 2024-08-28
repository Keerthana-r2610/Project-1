
    public class CarrotHalwa extends Halwa{

        CarrotHalwa()
        {
            System.out.println("Constructor is created");
        }
        public static void main(String[] args) {

            Halwa myHalwa = new Halwa();
            myHalwa.flavor="Carrot";
            myHalwa.quantity=50;
            myHalwa.isSweet=true;
            System.out.println("Flavour:"+myHalwa.flavor);
            System.out.println("Quantity:"+ myHalwa.quantity);
            System.out.println("Sweet:"+myHalwa.isSweet);
            myHalwa.displayDetails();
            myHalwa.prepare();
        }
}
