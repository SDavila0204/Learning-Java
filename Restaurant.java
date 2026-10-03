package FIURestaurant;

public interface Restaurant {
    void takeOrder(String order);
    void prepareFood(String order);
    void serveFood(String order);
}
