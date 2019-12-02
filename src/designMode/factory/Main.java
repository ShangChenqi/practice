package designMode.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new AppleFactory();
        Apple apple = (Apple) factory.getFruit();
    }
}
