package Template;

/*
 * 模板模式：一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 * 意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
 */
public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	//模板
	public final void play() {

		//初始化游戏
		initialize();

		//开始游戏
		startPlay();

		//结束游戏
		endPlay();
	}
}
