package designMode.builder;

/**
 * 复杂对象的创建相当于组装一辆汽车，对象的属性相当于汽车的部件。
 * 这些部件的组合过程往往被"外部化"到一个称作建造者的对象里，建造者返还给客户端的是一个已经建造完毕的完整产品对象。
 * 客户无需关心该对象所包含的属性以及它们组装方式。
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
