package HuaWeiTest;

/**
 * 字符串匹配，给你一个父串，一个子串，求父串中子串出现的次数？
 * @author apple
 *
 */
public class Problem2 {
	public void test()
	{
		String parent = "abcsfdsfdsaabcs fdsfaabcabcsfdsfdsaabcs fdsfaabc";
		String son = " ";
		int fromIndex = 0;
		int count = 0;
		int maxIndex = parent.length() - son.length();
		if(maxIndex >= 0)
		{
			do {
				fromIndex = parent.indexOf(son, fromIndex);
				if(fromIndex >= 0 && fromIndex <= maxIndex)
				{
					count++;
				}
			}while((fromIndex >= 0) && (fromIndex = fromIndex + 1) <= maxIndex);
		}
		System.out.println("count = "+count);
	}
}
