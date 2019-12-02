package designMode.strategy;

/**
 * 策略模式 ➕ 简单工厂模式
 * <p>
 * 有三个不同的具体策略类A、B、C，客户端需要根据不同的情况选择不同的策略。
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context('D');     //客户端只需要接触Context类，而不需要了解Strategy类
        context.func();
    }
}
