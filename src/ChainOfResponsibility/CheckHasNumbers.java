package ChainOfResponsibility;

public class CheckHasNumbers extends CheckHandler{
    @Override
    protected void check(String request) {
        if(request.matches(".*\\d.*"))
            System.out.println("Проверка наличия цифр: есть цифры");
    }
}
