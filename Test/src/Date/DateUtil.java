package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static String DATE_PATTERN_1 = "yyyy-MM-dd HH:mm:ss";
    public static String DATE_PATTERN_2 = "yyyy-MM-dd";//运动数据的后台日期格式
    public static String DATE_PATTERN_3 = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";
    public static String DATE_PATTERN_4 = "yyyy.MM.dd";
    public static String DATE_PATTERN_5 = "yyyy-MM-dd HH:mm:ss.sss";
    public static String DATE_PATTERN_6 = "yyyy年MM月";
    public static String DATE_PATTERN_7 = "yyyy.M.d";
    public static String DATE_PATTERN_8 = "yyyy 年 MM 月 dd 日";
    
	public static Date clearDateForWeekMonthData(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        return new Date(calendar.getTimeInMillis());
    }
	
	public static String dateToString(Date date, String pattern) {
        if (null != date) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.format(date);
        } else {
            return "";
        }
    }


    public static Date stringToDate(String dateStr,String pattern)
    {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        Date date = new Date();
        try{
            date = formatter.parse(dateStr);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return date;
    }

}
