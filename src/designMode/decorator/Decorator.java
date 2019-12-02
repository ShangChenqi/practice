package designMode.decorator;

/**
 * 装饰抽象类，继承了Component，从外类来扩展Component类的功能，对于Component类来说，无需知道它的存在。
 */
public abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
