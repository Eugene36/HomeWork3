package Strategy;

public class CarStrategy implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Заказ будет доставлен курьером на автомобиле");
    }
}