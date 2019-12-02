package designMode.strategy;

public class Context {
    private Strategy strategy;

    public Context(char type) throws Exception {    //生产策略对象的工厂放到这里来实现！
        switch (type) {
            case 'A':
                strategy = new ConcreteStrategyA();
                break;
            case 'B':
                strategy = new ConcreteStrategyB();
                break;
            case 'C':
                strategy = new ConcreteStrategyC();
                break;
            default:
                throw new Exception("unknown type " + type);
        }
    }

    public void func() {
        strategy.algorithm();
    }

}
