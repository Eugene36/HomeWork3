package ChainOfResponsibility;

// Например цепочка проверок строки
abstract class CheckHandler {
    protected CheckHandler next;

    public void setNext(CheckHandler next) {
        this.next = next;
    }

    public void handle(String request) {
        check(request);
        if(next != null)
            next.handle(request);
    }

    protected abstract void check(String request);

}
