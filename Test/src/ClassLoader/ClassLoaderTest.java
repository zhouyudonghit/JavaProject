package ClassLoader;

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
