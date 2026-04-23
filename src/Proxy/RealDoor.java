package Proxy;

public class RealDoor implements Door{

    @Override
    public void getInto() {
        System.out.println("ReadDoor: Вы зашли");
    }
}
