package Singleton;

/**
 * 单例模式：在应用程序中保证最多只能有一个实例
 * 单例模式——懒汉式
 * 对象只有被调用时才被创建
 * @author 63196
 *
 */
public class SingleTon {
	// 由于对象需要被静态方法调用，所以把对象也设置成static
	// 由于对象是static，必须要设置访问权限修饰符为private，如果是public则可以直接调用对象，不执行访问入口
	private static SingleTon singleTon;

	/**
	 * 构造方法声明为private，其他类不能实例化这个类对象
	 * 需要通过getInstance提供访问入口
	 */
	private SingleTon() {

	}

	/**
	 * 对外提供访问入口
	 * 实例方法，实例方法必须通过对象调用
	 * 因为构造方法设置为private，不能new出一个对象，所以需要设置方法为静态方法
	 * @return
	 */

	public static SingleTon getInstance() {
		//添加逻辑，如果实例化过，直接返回
		/*
		 * 多线程访问下，可能出现if同时成立的情况，所以需要添加锁
		 */
		if (singleTon == null) {
			synchronized (SingleTon.class) {
				// 双重验证
				if (singleTon == null) {
					singleTon = new SingleTon();
				}
			}
		}
		return singleTon;
	}
}
