package designMode.simpleFactory;

public class Factory {
    private Fruit fruit;
    public Fruit getFruit(char type) throws Exception {
        switch (type){
            case 'A' : return new Apple();
            case 'O' : return new Orange();
            case 'P' : return new Pear();
            default: throw new Exception("unknown type");
        }
    }
}
