package Factory.AbstractFactory;

/*
 * 抽象工厂：是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 */

/*
 * 创建一个超级工厂
 */
public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);

	public abstract Color getColor(String color);
}
