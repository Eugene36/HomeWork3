package Adapter;

public class JackToUSBAdapter implements USBC{
    private final Jack35mm headphones;

    public JackToUSBAdapter(Jack35mm headphones) {
        this.headphones = headphones;
    }

    @Override
    public void connectUSBC() {
        System.out.println("Adapter: конвертирую...");
        headphones.connectJack();
        System.out.println("Adapter: Наушнкик работают через адаптер.");
    }
}
