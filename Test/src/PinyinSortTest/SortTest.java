package PinyinSortTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
	public void sort()
	{
		List<TestBean> data = DataSource.generateTestData();
		long startTime = System.currentTimeMillis();
		Collections.sort(data, new Comparator<TestBean>()
				{
					@Override
					public int compare(TestBean o1, TestBean o2) {
						// TODO Auto-generated method stub
						if(o1 == null && o2 == null)
						{
							return 0;
						}
						if(o1 == null )
						{
							if(o2.getName() == null || o2.getName().length() == 0)
							{
							    return 0;
							}else {
								return -1;
							}
						}
						if(o2 == null)
						{
							if(o1.getName() == null || o1.getName().length() == 0)
							{
								return 0;
							}else {
								return 1;
							}
						}
						return o1.getName().compareToIgnoreCase(o2.getName());
					}
				}
				);
		long endTime = System.currentTimeMillis();
		System.out.println("consumed time = "+(endTime-startTime));
		System.out.println("after sort----------");
		for(TestBean bean:data)
		{
			System.out.println(bean.getName());
		}
	}

	
}
