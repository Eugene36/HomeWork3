package Adapter;

public class Headphones implements Jack35mm{
    @Override
    public void connectJack() {
        System.out.println("Наушники подключены через jack 3.5mm");
    }
}
