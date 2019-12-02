package designMode.factory;

public class PearFactory implements Factory {

    @Override
    public Pear getFruit() {
        return new Pear();
    }
}
