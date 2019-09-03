package ShallowAndDeepCloneTest;

public class Test {
	public void test()
	{
		String s1 = new String("aaa");
		String s2 = new String("aaa");
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		Object mine = "Hi there".toCharArray();  
        long address;
		try {
			address = Addresser.addressOf(mine);
			System.out.println("Addess: " + address);
			System.out.println("s1: " + Addresser.addressOf(s1));
			System.out.println("s2: " + Addresser.addressOf(s2));
			System.out.println("s2: " + Addresser.addressOf("aaa"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	
	
//	 public static void printBytes(long objectAddress, int num) {  
//	        for (long i = 0; i < num; i++) {  
//	            int cur = unsafe.getByte(objectAddress + i);  
//	            System.out.print((char) cur);  
//	        }  
//	        System.out.println();  
//	    }
	
	public void test1()
	{
		TestBean testBean = new TestBean();
		testBean.setName("test");
		testBean.setAge(20);
		System.out.println(testBean);
		TestBean testBean2 = testBean.clone();
		System.out.println(testBean2);
	}
}
