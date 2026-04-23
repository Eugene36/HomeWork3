package Strategy;

public class WalkStrategy implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Заказ будет доставлен курьером пешком");
    }
}