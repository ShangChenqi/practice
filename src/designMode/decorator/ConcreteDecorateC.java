package designMode.decorator;

public class ConcreteDecorateC extends Decorator {
    @Override
    public void operation(){
        super.operation();
        System.out.println("add ConcreteDecorateC's operation");
    }
}
