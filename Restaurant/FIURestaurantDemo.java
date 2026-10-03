package FIURestaurant;

public class FIURestaurantDemo {
    public static void main(String[] args) {
        MiamiCheesecakeFactory fiu = new MiamiCheesecakeFactory();

        System.out.println("The customer sat on the table " + fiu.serveBreadAndButter());
        fiu.takeOrder("avocado eggrolls");
        fiu.prepareFood("Avocado eggrolls");
        fiu.serveFood("avocado eggrolls");
    }
}
