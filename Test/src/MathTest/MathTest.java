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
		float f = 0.008106819f;
		System.out.println(f*251.64f);
	}

}
