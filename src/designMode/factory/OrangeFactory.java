package designMode.factory;

public class OrangeFactory implements Factory {

    @Override
    public Orange getFruit() {
        return new Orange();
    }
}
