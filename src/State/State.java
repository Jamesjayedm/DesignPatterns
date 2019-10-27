package State;

/*
 * 状态模式
 * 允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * 主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 */
public interface State {
	void doAction(Context context);
}
