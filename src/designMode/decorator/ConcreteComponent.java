package designMode.decorator;

/**
 * 定义了一个具体的对象
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent's operation");
    }
}
