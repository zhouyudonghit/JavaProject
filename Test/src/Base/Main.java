package Base;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import Date.DateTest;
import Extends.Son;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "%5B%7B%22calorie%22%3A11.826197%2C%22distance%22%3A0.49279884%2C%22frSource%22%3A1%2C%22hourSegment%22%3A15%2C%22minuteSegment%22%3A4%2C%22movementTime%22%3A%222019-06-07%22%2C%22secondInterval%22%3A300%2C%22startTime%22%3A%222019-06-07+14%3A15%3A00%22%2C%22stepCount%22%3A704%2C%22userDeviceId%22%3A%22869902041519494%22%2C%22uuid%22%3A%22201906071400008699020415194946004912902%22%7D%2C%7B%22calorie%22%3A14.564371%2C%22distance%22%3A0.60689783%2C%22frSource%22%3A1%2C%22hourSegment%22%3A15%2C%22minuteSegment%22%3A9%2C%22movementTime%22%3A%222019-06-07%22%2C%22secondInterval%22%3A300%2C%22startTime%22%3A%222019-06-07+14%3A40%3A00%22%2C%22stepCount%22%3A867%2C%22userDeviceId%22%3A%22869902041519494%22%2C%22uuid%22%3A%22201906071400008699020415194946004912902%22%7D%2C%7B%22calorie%22%3A9.533642%2C%22distance%22%3A0.38214326%2C%22frSource%22%3A1%2C%22hourSegment%22%3A15%2C%22minuteSegment%22%3A10%2C%22movementTime%22%3A%222019-06-07%22%2C%22secondInterval%22%3A300%2C%22startTime%22%3A%222019-06-07+14%3A45%3A00%22%2C%22stepCount%22%3A591%2C%22userDeviceId%22%3A%22869902041519494%22%2C%22uuid%22%3A%22201906071400008699020415194946004912902%22%7D%2C%7B%22calorie%22%3A9.496265%2C%22distance%22%3A0.3790915%2C%22frSource%22%3A1%2C%22hourSegment%22%3A15%2C%22minuteSegment%22%3A11%2C%22movementTime%22%3A%222019-06-07%22%2C%22secondInterval%22%3A300%2C%22startTime%22%3A%222019-06-07+14%3A50%3A00%22%2C%22stepCount%22%3A533%2C%22userDeviceId%22%3A%22869902041519494%22%2C%22uuid%22%3A%22201906071400008699020415194946004912902%22%7D%2C%7B%22calorie%22%3A4.696926%2C%22distance%22%3A0.18750143%2C%22frSource%22%3A1%2C%22hourSegment%22%3A15%2C%22minuteSegment%22%3A12%2C%22movementTime%22%3A%222019-06-07%22%2C%22secondInterval%22%3A300%2C%22startTime%22%3A%222019-06-07+14%3A55%3A00%22%2C%22stepCount%22%3A295%2C%22userDeviceId%22%3A%22869902041519494%22%2C%22uuid%22%3A%22201906071400008699020415194946004912902%22%7D%5D";
		ArrayList<Object> list = new ArrayList<>();
		Object obj = new Object();
		System.out.println(obj);
		list.add(obj);
		Object obj2 = list.get(0);
		obj2 = new Object();
		
		
		for(int i = 0;i < 100000;i++)
		{
		    double d = 1.11;
		    if(d != 1.11)
		    {
		        System.out.println("find");
		    }
		}
		System.out.println("over");
	}

}
