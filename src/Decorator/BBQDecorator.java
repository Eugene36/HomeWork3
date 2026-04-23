package Decorator;

public class BBQDecorator extends PizzaDecorator{
    public BBQDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return pizza.getName() + " + соус BBQ";
    }
}
