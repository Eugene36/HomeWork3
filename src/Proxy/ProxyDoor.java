package Proxy;

public class ProxyDoor implements Door{
    RealDoor realDoor;

    public ProxyDoor(RealDoor realDoor){
        this.realDoor = realDoor;
    }

    @Override
    public void getInto() {
        System.out.println("Proxy: Уточняю, можно ли войти");
        // Не придумал что написать, но какой-нибудь запрос проверки
        System.out.println("Proxy: Заходите пожалуйста");
        realDoor.getInto();
    }
}
