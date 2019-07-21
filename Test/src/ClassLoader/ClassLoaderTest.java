package ClassLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderTest {
	public void test()
	{
		ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
	    System.out.println("ϵͳ��װ����:" + appClassLoader);
	    ClassLoader extensionClassLoader = appClassLoader.getParent();
	    System.out.println("ϵͳ��װ�����ĸ��������������չ�������:" + extensionClassLoader);
	    ClassLoader bootstrapClassLoader = extensionClassLoader.getParent();
	    System.out.println("��չ��������ĸ�����������������������:" + bootstrapClassLoader);
	    
	    String s = "hello";
	    System.out.println("String����������ǣ�"+s.getClass().getClassLoader());
	}
	
	public void test2() throws ClassNotFoundException
	{
		MyClassLoader loader = new MyClassLoader();
		try {
			String myPath = "C:\\Users\\yudongzhou\\Desktop\\HighRichHandsome.class";
//			Class c = loader.loadClass("ClassLoader.HighRichHandsome");
			Class c = loader.loadClass("ClassLoader.HighRichHandsome");
			System.out.println("Loaded by 1:" + c.getClassLoader());
			Person p = (Person) c.newInstance();
			p.say();
			
//			HighRichHandsome man = (HighRichHandsome) c.newInstance();
//		    man.say();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			Class c = loader.findClass("ClassLoader.HighRichHandsome");
//			System.out.println("Loaded by 1:" + c.getClassLoader());
//			Person p = (Person) c.newInstance();
//			p.say();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	public void test3()
	{
		MyClassLoader loader = new MyClassLoader();
		try {
			Class c = loader.findClass("ClassLoader.HighRichHandsome");
			System.out.println("Loaded by 1:" + c.getClassLoader());
			Object obj = c.newInstance();
			System.out.println(obj);
			Method method = c.getMethod("test2", null);
			method.invoke(obj, null);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	}
}
