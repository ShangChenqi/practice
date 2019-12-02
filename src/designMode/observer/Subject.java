package designMode.observer;

import java.util.LinkedList;

/**
 * Subject类，它把所有对观察者对象的引用保存到一个聚集里，每个主题都可以有任何数量的观察者。
 * 抽象主题提供一个接口，可以增加和删除观察者对象。
 */
public abstract class Subject {
    private LinkedList<Observer> observers = new LinkedList<>();

    //增加观察者
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //移除观察者
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知
    public void Notify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
