package ChainOfResponsibility;

public class CheckUppercase extends CheckHandler{
    @Override
    protected void check(String request) {
        if(request.equals(request.toUpperCase()))
            System.out.println("Проверка заглавных: Строка состоит только из заглавных букв");
    }
}
