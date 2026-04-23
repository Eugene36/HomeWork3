import Adapter.Headphones;
import Adapter.Jack35mm;
import Adapter.JackToUSBAdapter;
import Adapter.USBC;
import Builder.Computer;
import ChainOfResponsibility.CheckHasNumbers;
import ChainOfResponsibility.CheckSize;
import ChainOfResponsibility.CheckUppercase;
import Decorator.BBQDecorator;
import Decorator.CheeseDecorator;
import Decorator.Pepperoni;
import Decorator.Pizza;
import Proxy.Door;
import Proxy.ProxyDoor;
import Proxy.RealDoor;
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

        System.out.println();

        //3. Builder (через вложенный статический класс)
        Computer computer = new Computer.ComputerBuilder("Intel I7 13400", "Gigabyte z690").addDisplay("Asus vzv").addKeyboard("Keyboard").addMouse("a4tech x7").build();
        System.out.println(computer);

        System.out.println();

        //4. Proxy
        Door door = new ProxyDoor(new RealDoor());
        door.getInto();

        System.out.println();

        //5. Decorator
        Pizza pepperoni = new Pepperoni();
        Pizza pizza1 = new CheeseDecorator(pepperoni);
        System.out.println(pizza1.getName());

        Pizza pizza2 = new BBQDecorator(pepperoni);
        System.out.println(pizza2.getName());

        System.out.println();

        //6. Adapter
        Jack35mm headphones = new Headphones();
        USBC adapter = new JackToUSBAdapter(headphones);
        adapter.connectUSBC();
    }
}