package ClassLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		ClassLoaderTest test = new ClassLoaderTest();
		test.test();
		MyClassLoader loader = new MyClassLoader();
		System.out.println("loader.getParent() = " + loader.getParent());
		Class c = loader.loadClass("ClassLoader.ClassLoaderTest");
		try {
			Object obj = c.newInstance();
			System.out.println(obj);
			Method method = c.getMethod("test2", null);
			method.invoke(obj, null);
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			ClassLoaderTest test = (ClassLoaderTest) c.newInstance();
//			test.test2();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Class.forName("");
	}

}
