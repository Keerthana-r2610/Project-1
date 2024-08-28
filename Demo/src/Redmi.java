

    public class Redmi extends SmartPhone {

        Redmi()
        {
            System.out.println("Constructor is created");
        }
        public static void main(String[] args) {

            Redmi redmi= new Redmi();
            redmi.brand="Redmi note 8";
            redmi.model="2022";
            redmi.storage=90;
            redmi.is5GEnabled=true;
            System.out.println("Brand:"+redmi.brand);
            System.out.println("Model:"+redmi.model);
            System.out.println("Storage:"+redmi.storage);
            System.out.println("5g enabled:"+redmi.is5GEnabled);
            redmi.displayDetails();
            redmi.makeCall("+1234567890");
        }


}
