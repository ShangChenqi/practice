package designMode.simpleFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        //通过工厂创建了一种水果🍉
        Fruit fruit = new Factory().getFruit('O');
    }
}
