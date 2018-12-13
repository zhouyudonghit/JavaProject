package GenericType;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeTest {
	public void test1()
	{
		List<? extends Object> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list = list2;
		list2.add("2");
		List<Integer> list3 = new ArrayList<>();
		list3.add(4);
		List list4 = list3;
		list4.addAll(list2);
		
		ArrayList<String> list5 = new ArrayList<>();
		list5.add("5");
		list5 = (ArrayList<String>) list5.subList(0, 1);
		
		System.out.println(list4);
	}

}
