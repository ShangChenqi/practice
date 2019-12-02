package designMode.observer;

/**
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 * 这个主题对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己。
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver(subject, "observer1");
        ConcreteObserver observer2 = new ConcreteObserver(subject, "observer2");
        ConcreteObserver observer3 = new ConcreteObserver(subject, "observer3");

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.setSubjectState("this is a new message!");

        subject.Notify();
    }
}
