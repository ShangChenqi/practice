package designMode.proxy;

public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("RealSubject's request");
    }
}
