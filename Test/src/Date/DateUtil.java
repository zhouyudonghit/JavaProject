package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static String DATE_PATTERN_1 = "yyyy-MM-dd HH:mm:ss";
    public static String DATE_PATTERN_2 = "yyyy-MM-dd";//运动数据的后台日期格式
    
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
