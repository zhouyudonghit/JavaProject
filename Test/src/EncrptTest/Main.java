package EncrptTest;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
//		String testString = "12345678";
//		System.out.println(MD5Test.getMD5(testString));
//		
//	
//		System.out.println(random());
		
		String key = "123456";
		String value = "dsafasfdsfdasfsdfdsfsdf";
		System.out.println(HmacSHA256Util.hmacSha256(key, value));
	}

	private static String random()
    {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < 16;i++)
        {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
