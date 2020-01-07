package UriTest;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

public class UriTest {
	public void test1()
	{
		try {
			URI uri = new URI("https://192.168.1.132:8888");
			System.out.println(uri.getHost());
			System.out.println(uri.getPath());
			System.out.println(uri.toString());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test2()
	{
		String str = ":https://passportprexg.cnsuning.com/ids/login?service=https%3A%2F%2Faqprexg.cnsuning.com%2Fasc%2Fauth%3FtargetUrl%3Dhttps%253A%252F%252Fb2cprexg.cnsuning.com&custNum=K3FgyGBW2ywZPMlicVqnjs/aBnQALkOyipSwtEcXS2IDJ0hh1RIpBKrVCu1Xz+YiYFSDOOqWqwbLQT/gsLNNUKwYhV7emr9MCitU0EpK37oGkdm/YO06nB4RCIKjM8dOB6cILTExr2kV27f9Cw8Ja9S9e1oAp3uy79AXEM1XdZw=&appCode=asc&transNo=IDS-20200103141125766-0284683555&authCode=IDS-20200103141125766-0284683555&sign=MO3+R1Si32Fc7jZUvmtT6KcfqlCoQZl+FXp/T8XW69THNZUXXRQadzpmbia9tBb1S5voucNtiF9O9kHoA7U5TogADh5/e50pKjxJ5XgpQT8eA1jVFMZ9FgIzvqxwItkRD8RL9MEOzPFFj9gBji90qWqgMDWs9/NeZ+9VIls3Soc=&authCodeLoginFlag=true&loginChannel=208000103053";
		System.out.println(URLDecoder.decode(str));
		System.out.println(getValueByName(str,"targetUrl"));
		try {
			System.out.println(URLDecoder.decode("targetUrl%3Dhttps%253A%252F%252Fb2cprexg.cnsuning.com","utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = " a = ";
		s = s.replace(" ", "");
		String[] temp1 = s.split("=");
		System.out.print(temp1.length);
	}
	
	private String getValueByName(String url, String name) {
        String result = "";
        int index = url.indexOf("targetUrl");
        StringBuilder sb = new StringBuilder();
        while(url.charAt(index) != '&' && index < url.length())
        {
            sb.append(url.charAt(index));
            index++;
        }
        try {
            result = URLDecoder.decode(sb.toString(),"utf-8");
            result = URLDecoder.decode(result,"utf-8");
            String[] temps = result.split("=");
            if(temps != null && temps.length >= 2)
            {
                result = temps[1];
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
