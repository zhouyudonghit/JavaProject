package MathTest;

public class MathTest {

	public void test()
	{
		int x = -3;
		float y = -10.0f;
		System.out.println(2^5);
		System.out.println(false?99.9:9);
	}
	
	public void test2()
	{
		double sin = Math.toRadians(90);
		System.out.println(sin);
		System.out.println(Math.sin(sin));
		System.out.println("====");
		double cos = Math.toRadians(45);
		System.out.println(cos);
		System.out.println(Math.cos(cos));
		System.out.println("====");
		double tan = Math.toRadians(45);
		System.out.println(tan);
		System.out.println(Math.tan(tan));
		System.out.println("====");
		double asin = Math.asin(1);
		System.out.println(asin);
		System.out.println(Math.toDegrees(asin));
		System.out.println("====");
		double acos = Math.acos(0.7071067811865476);
		System.out.println(asin);
		System.out.println(Math.toDegrees(asin));
		System.out.println("====");
		double atan = Math.atan(1);
		System.out.println(atan);
		System.out.println(Math.toDegrees(atan));
		String s;
	}
	
	
	public void test3()
	{
		double d1 = 0.0252;
		System.out.println("d1 = "+d1);
        double d2 = 0.019600000000000003;
        System.out.println("d2 = "+d2);
        double d3 = 0.044800000000000003;
        System.out.println("d3 = "+String.valueOf(d3));
        System.out.println("d1 + d2 = "+String.valueOf(d1+d2));
        System.out.println(Double.valueOf("0.044800000000000003"));
        System.out.println(1 - 0.42);
        System.out.println(2.4 + 1.2);
        System.out.println(4.015 * 100);
        System.out.println(123.1 / 100);
        System.out.println(MathUtil.sum(d1, d2));
//        double d3 = 0.00173000000002;
//        double d4 = 0.00134;
//        System.out.println(d3+d4);
//        System.out.println(d3+d4+"");
        float f1 = 0.0252f;
        float f2 = 0.019600000000000003f;
//        System.out.println("f2 = "+f2);
//        System.out.println(String.valueOf(f1+f2));
        
        float f_v1 = 20;  
		float f_v2 = 20.3f;  
		float f_v3 = 20.5f;  
		      
		double d_v1 = 20;  
		double d_v2 = 20.3;  
		double d_v3 = 20.5;
		
		System.out.println((f_v1 == d_v1)?"true":"false"); 
		System.out.println(f_v2 == d_v2?"true":"false");  
		System.out.println(f_v3 == d_v3?"true":"false");
	}
	
	public void test4()
	{
//		double d1 = 2.3d;
//		double d2 = Math.ceil(d1);
//		System.out.println(d2);
//		int a = new Double(d2).intValue();
//		System.out.println(a);
		float f = 111111112f;
		System.out.println(f);
		System.out.print(7*24*3600*1000);
		System.out.println(Long.SIZE);
		
		float scale = 800*1.0f/799;
		System.out.print(scale);
		
	}
	
	public void test5()
	{
		long i = -1;
		System.out.println(Long.toBinaryString(i));
		System.out.println(Long.bitCount(i));
	}
	
	public void test6()
	{
		float percent = (float)54324/(float)345;
		System.out.println("percent = "+percent);
		// 保留一位乘十再除十，保留两位改为100，以此类推
		percent = ((float)Math.round(percent*10))/10;
		System.out.println("percent = "+percent);
		
		String value = "77.1234568";
		System.out.print(Float.valueOf(value));
	}
	
	/**
	 * @hide
	 */
	public void test7()
	{
		int start = 5;
		String l = "2";
		start += l.length() + 2;
		System.out.println(start);
	}
	
	public void test8()
	{
		int i = 0x40000001;
		//i在左移1位之后就会变成0x80000000,也就是2进制的100000...0000,符号位被置1,其他位全是0,变成了int类型所能表示的最小值,32位的int这个值是-2147483648
		System.out.println( i = i << 1);
		//如果再接着把i左移1位会出现什么情况呢?在C语言中采用了丢弃最高位的处理方法,丢弃了1之后,i的值变成了0
		System.out.println( i = i << 1);
		
		/*
		 * 左移里一个比较特殊的情况是当左移的位数超过该数值类型的最大位数时,编译器会用左移的位数去模类型的最大位数,然后按余数进行移位,如:

            int i = 1, j = 0x80000000; //设int为32位
            i = i << 33;   // 33 % 32 = 1 左移1位,i变成2
            j = j << 33;   // 33 % 32 = 1 左移1位,j变成0,最高位被丢弃
		 */
	}
}
