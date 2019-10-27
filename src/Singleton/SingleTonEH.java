package Singleton;

public class SingleTonEH {
	// 在类加载时进行实例化
	private static SingleTonEH singleTon = new SingleTonEH();

	private SingleTonEH() {

	}

	public static SingleTonEH getInstance() {
		return singleTon;
	}
}
