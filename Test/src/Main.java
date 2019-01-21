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
		String content = "";
		try {
			content = URLEncoder.encode("dsfdsf&","utf-8");
			System.out.println(content);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String content2 = URLDecoder.decode(content, "utf-8");
		System.out.println(content2);
		
		String test = "pdf";
		System.out.println(test);
		test = "\"" + test +"\""; 
		System.out.println(test);
		test = "\"" + test +"\""; 
		System.out.println(test);
		
		String str = "1.00001";
		int num = Integer.parseInt(null);
		System.out.println(num);
	}

}
