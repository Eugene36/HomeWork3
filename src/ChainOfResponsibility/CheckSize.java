package ChainOfResponsibility;

public class CheckSize extends CheckHandler {
    @Override
    protected void check(String request) {

        if(request.length() > 5)
            System.out.println("Проверка длины: Больше 5 символов");
    }
}
