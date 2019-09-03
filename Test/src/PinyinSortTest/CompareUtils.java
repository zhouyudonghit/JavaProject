package PinyinSortTest;

public class CompareUtils {
	public static int stringLexicographicalCompare(String str1,String str2)
	{
		int result = 0;
		if(str1.length() == 0 && str2.length() == 0)
		{
			return 0;
		}
		if(str1.length() == 0)
		{
			return -1;
		}
		if(str2.length() == 0)
		{
			return 1;
		}
		return result;
	}
}
