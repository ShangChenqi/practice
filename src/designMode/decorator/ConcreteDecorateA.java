package designMode.decorator;

public class ConcreteDecorateA extends Decorator {
    @Override
    public void operation(){
        super.operation();
        System.out.println("add ConcreteDecorateA's operation");
    }
}
