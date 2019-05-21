package ClassLoader;

public class ClassLoaderTest {
	public void test()
	{
		ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
	    System.out.println("系统类装载器:" + appClassLoader);
	    ClassLoader extensionClassLoader = appClassLoader.getParent();
	    System.out.println("系统类装载器的父类加载器——扩展类加载器:" + extensionClassLoader);
	    ClassLoader bootstrapClassLoader = extensionClassLoader.getParent();
	    System.out.println("扩展类加载器的父类加载器——引导类加载器:" + bootstrapClassLoader);
	    
	    String s = "hello";
	    System.out.println("String的类加载器是："+s.getClass().getClassLoader());
	}
	
	public void test2()
	{
		MyClassLoader loader = new MyClassLoader();
		try {
			Class c = loader.loadClass("ClassLoader.HighRichHandsome");
			System.out.println("Loaded by 1:" + c.getClassLoader());
			Person p = (Person) c.newInstance();
			p.say();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
