package designMode.decorator;

/**
 * 装饰模式（Decorator）：动态的给一个对象增加额外的职责，就增加功能来说，装饰模式比生成子类更加灵活。
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();

        //三个不同的装饰类为具体类增加职责
        ConcreteDecorateA concreteDecorateA = new ConcreteDecorateA();
        ConcreteDecorateB concreteDecorateB = new ConcreteDecorateB();
        ConcreteDecorateC concreteDecorateC = new ConcreteDecorateC();

        //为具体类增加职责A
        concreteDecorateA.setComponent(component);
        //为增加了职责A的具体类增加职责B
        concreteDecorateB.setComponent(concreteDecorateA);
        //为增加了AB职责的具体类增加职责C
        concreteDecorateC.setComponent(concreteDecorateB);

        concreteDecorateC.operation();
    }
}
