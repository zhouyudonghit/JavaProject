package Format;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import Base.PrintUtil;

public class Test {
	public static final String FORMAT_0 = "#";
    public static final String FORMAT_1 = "#.##";
    public static final String FORMAT_2 = "0.00";
    public static final String FORMAT_3 = "0.0";
    public static final String FORMAT_4 = "##0.0";
    
	public void test()
	{
//		DecimalFormat mFormat = new DecimalFormat("#.##");
//		mFormat.setMaximumFractionDigits(2);
//		mFormat.setRoundingMode(RoundingMode.HALF_UP);
//		PrintUtil.println(mFormat.format(2.305));
//		PrintUtil.println(mFormat.format("2.313"));//会抛异常
		
//		Double num = 69.26545; 
//		PrintUtil.println(String.format("%.2f", num));
		
		double d = 0.2;
//		PrintUtil.println(formatStringHalfUp(FORMAT_0,d));
//		PrintUtil.println(formatStringHalfUp(FORMAT_1,d));
//		PrintUtil.println(formatStringHalfUp(FORMAT_2,d));
//		PrintUtil.println(formatStringHalfUp(FORMAT_3,d));
//		PrintUtil.println(formatStringHalfUp(FORMAT_4,d));
		
		String str = "Login";
		System.out.println(str.contains("login"));
	}

	public static String formatStringHalfUp(String format, double num)
    {
        DecimalFormat dFormat = new DecimalFormat(format);
        dFormat.setRoundingMode(RoundingMode.HALF_UP);
        return dFormat.format(num);
    }
	
	public void test2()
	{
		float f = 0.009f;
		//对于0.9来说，如果用"#.0"来格式化，最后是。9
		DecimalFormat df =new DecimalFormat("#.##");
//		df.setRoundingMode(RoundingMode.HALF_DOWN);
		String result = df.format(f);
		System.out.println("result = "+result);
		System.out.println(Math.round(f));
		
		float h = 2.000f;
		//对于0.9来说，如果用"#.0"来格式化，最后是。9
		DecimalFormat df2 =new DecimalFormat("0.#");
//		df2.setRoundingMode(RoundingMode.HALF_DOWN);
		String result2 = df2.format(h);
		System.out.println("result = "+result2);
		System.out.println(Math.round(h));
		String s = "0.5";
		System.out.println(Float.valueOf(s));
	}
}
