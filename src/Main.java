import ChainOfResponsibility.CheckHasNumbers;
import ChainOfResponsibility.CheckSize;
import ChainOfResponsibility.CheckUppercase;
import Strategy.Restaurant;

public class Main {
    public static void main(String[] args) {
        //1. Strategy
        Restaurant restaurant1 = new Restaurant("small");
        Restaurant restaurant2 = new Restaurant("medium");
        Restaurant restaurant3 = new Restaurant("large");

        restaurant1.deliver();
        restaurant2.deliver();
        restaurant3.deliver();

        System.out.println();

        //2. Chain of responsibility
        // Немного уродское создание цепочки, но просто для примера пойдет
        CheckSize checkSize = new CheckSize();
        CheckHasNumbers checkHasNumbers = new CheckHasNumbers();
        CheckUppercase checkUppercase = new CheckUppercase();

        checkHasNumbers.setNext(checkUppercase);
        checkSize.setNext(checkHasNumbers);

        checkSize.handle("QRJFAO4422");

        //3. Builder


    }
}