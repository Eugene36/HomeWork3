package Strategy;

public class BicycleStrategy implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Заказ будет доставлен курьером на велосипеде");
    }
}
