package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * InvocationHandler（处理器接口）：可以通过invoke方法实现对真实角色的代理访问。
 */
public class MyInvocationHandler implements InvocationHandler {

	Subject realSubject;

	public MyInvocationHandler(Subject realSubject) {
		this.realSubject = realSubject;
	}

	/**
	*
	* @param proxy    代理类
	* @param method    正在调用的方法
	* @param args      方法的参数
	* @return
	* @throws Throwable
	*/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("调用代理类");
		if (method.getName().equals("sellBooks")) {
			int invoke = (int) method.invoke(realSubject, args);
			System.out.println("调用的是卖书的方法");
			return invoke;
		} else {
			String string = (String) method.invoke(realSubject, args);
			System.out.println("调用的是说话的方法");
			return string;
		}
	}

}
