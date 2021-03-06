package Date;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Timer;

public class DateTest {
	public void test()
	{
		String dateStr = "1918-01-01";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = simpleDateFormat.parse(dateStr);
			System.out.println(date.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date date2 = new Date(164102406550l);
		System.out.println(simpleDateFormat.format(date2));
		System.out.println(DateUtil.dateToString(date2, "yyyy-MM"));
	}
	
	public void test1()
	{
		Date date = new Date();
		date = DateUtil.clearDateForWeekMonthData(date);
		System.out.println(date.getTime());
		
//		date.setMonth(date.getMonth()+1);
//		System.out.println(date.getTime());
		date = new Date(date.getTime()+3600*1000-1);
		System.out.println(DateUtil.dateToString(date, DateUtil.DATE_PATTERN_8));
	}
	
	public void test2()
	{
		Date date1 = DateUtil.stringToDate("2018-11-14 01:38:00", DateUtil.DATE_PATTERN_1);
		System.out.println(date1.getTime());
		
		Date date2 = DateUtil.stringToDate("2018-10-31 01:38:00", DateUtil.DATE_PATTERN_1);
		System.out.println(date2.getTime());
		
		Date date3 = DateUtil.stringToDate("2018-10-15 01:38:00", DateUtil.DATE_PATTERN_1);
		System.out.println(date3.getTime());
		
		Date date4 = DateUtil.stringToDate("2013-01-01 00:00:00", DateUtil.DATE_PATTERN_1);
		System.out.println(date4.getTime());
		
		Date date5 = new Date(1541905419000L);
		System.out.println(date5);
	}
	
	public void test3()
	{
		Date date = new Date();
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis());
		System.out.println(DateUtil.dateToString(date, DateUtil.DATE_PATTERN_3));
		
		System.out.print(DateUtil.stringToDate("2019-08-17T11:51:47.812 +0800", DateUtil.DATE_PATTERN_3));
	}
	
	public void test4()
	{
		Calendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
		//gregorianCalendar.setTimeInMillis(millis);
		gregorianCalendar.get(14);
		Calendar ca = Calendar.getInstance();
		System.out.print(ca.get(14));
		System.out.print(ca);
	}
	
	public static double[] a(double[] dArr, double d) {
        double[] dArr2 = new double[dArr.length];
        double d2 = 0.0d;
        for (int i = 0; i < dArr.length; i++) {
            double d3 = 0.0d;
            double d4 = 0.0d;
            double d5 = 0.0d;
            for (double d6 : dArr) {
                double d7 = d4 - d2;
                d7 = Math.exp(-((d7 * d7) / ((2.0d * d) * d)));
                d3 += d6 * d7;
                d4 += 1.0d;
                d5 += d7;
            }
            dArr2[i] = d3 / d5;
            d2 += 1.0d;
        }
        return dArr2;
    }
}
