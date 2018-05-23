package DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * @author localuser
 *
 */
public class DynamicProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Subject realSubject = new RealSubject();
//       DynamicProxy proxy = new DynamicProxy(realSubject);
//       
//       ClassLoader classLoader = realSubject.getClass().getClassLoader();
//       Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
//       subject.visit();
		Subject realSubject = new RealSubject();
		System.out.println(realSubject.getClass());
		
		Subject proxy = (Subject) new DynamicProxyFactory(realSubject).getProxyInstance();
		System.out.println(proxy.getClass());
		
		proxy.visit();
	}

}
