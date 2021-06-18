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
//		PrintUtil.println(mFormat.format("2.313"));//»áÅ×Òì³£
		
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
}
