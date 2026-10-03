package FIURestaurant;

public class MiamiCheesecakeFactory  implements Restaurant, FIURestaurant, CheesecakeFactory{
    boolean clean = true;

    @Override
    public void takeOrder(String order) {
        System.out.println("preparing" + order);
    }
    @Override
    public void prepareFood(String order) {
        System.out.println("preparing " + order + " for customer");
    }

    @Override
    public void serveFood(String order) {
        System.out.println("serving " + order + "to customer");
    }
    @Override
    public String serveBreadAndButter() {
        return "Serving brown bread and butter at table";
    }
    @Override
    public boolean passesHealthInspection(){
        if(clean)
            return true;
        else
            return false;
    }

}
