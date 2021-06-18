package Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "#fdsafASDd123";
//		System.out.print(isLetterDigitOrChinese(str));
		System.out.println(isLetterDigit(str));
		
		String str2 = "我的口令是：$dmsv0hgs$";
		System.out.println(str2.indexOf("$"));
		
		String str3 = "3";
		System.out.println(str3.substring(2));
	}
	
	public static boolean isLetterDigitOrChinese(String str) {
		  String regex = "^[a-z0-9A-Z\u4e00-\u9fa5]+$";
		  return str.matches(regex);
		 }
	
	/**
	 * ^是开头
       +表示大于0次
       $表示结尾
	 * @param str
	 * @return
	 */
	public static boolean isLetterDigit(String str) {
		  String regex = "^[a-z0-9A-Z]+$";
		  return str.matches(regex);
		 }
}
