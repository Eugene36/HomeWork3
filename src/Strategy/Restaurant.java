package Strategy;

public class Restaurant {
    DeliveryStrategy deliveryStrategy;

    public void deliver(){
        deliveryStrategy.deliver();
    }

    public Restaurant(String turnover){
        // Глупый пример: Если ресторан маленький, то тольшо пешем доставляют. Если большой, то могут позволить доставку на машине.
        switch (turnover){
            case "medium":
                deliveryStrategy = new BicycleStrategy();
                break;
            case "large":
                deliveryStrategy = new CarStrategy();
                break;
            default:
                deliveryStrategy = new WalkStrategy();
                break;
        }

    }

}
