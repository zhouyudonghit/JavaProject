package PinyinSortTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataSource {
	private static char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'
			,'o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J'
			,'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private static int DATA_NUMBER = 500;
	private static int NAME_PINYIN_LENGTH = 16;
	
	public static List<TestBean> generateTestData()
	{
		List<TestBean> list = new ArrayList<>();
		Random random = new Random();
		int length = letters.length;
		for(int i = 0;i < DATA_NUMBER;i++)
		{ 
			StringBuilder sb = new StringBuilder(NAME_PINYIN_LENGTH);
			for(int j = 0;j<NAME_PINYIN_LENGTH;j++) {
				sb.append(letters[random.nextInt(length)]);
			}
			TestBean testBean = new TestBean();
			testBean.setName(sb.toString());
			System.out.println(sb.toString());
			testBean.setAge(10);
			testBean.setMoney(20);
			list.add(testBean);
		}
		return list;
	}

}
