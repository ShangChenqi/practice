package designMode.factory;

public class AppleFactory implements Factory {

    @Override
    public Apple getFruit() {
        return new Apple();
    }
}
