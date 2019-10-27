package Strategy;

/*
 * 策略模式（Strategy Pattern）:一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context对象。策略对象改变 context对象的执行算法。
 */
public interface Strategy {
	int doOperation(int num1, int num2);
}
