package designMode.decorator;

public class ConcreteDecorateB extends Decorator {
    @Override
    public void operation(){
        super.operation();
        System.out.println("add ConcreteDecorateB's operation");
    }
}
