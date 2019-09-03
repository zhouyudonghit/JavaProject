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
        double d2 = 0.019600000000000003;
//        0.044800000000000006
        System.out.println(Double.valueOf("0.044800000000000003"));
	}
	
}
