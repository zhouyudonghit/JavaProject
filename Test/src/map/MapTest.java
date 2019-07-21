package map;

import java.util.HashMap;
import java.util.Hashtable;

public class MapTest {
	public void test()
	{
		HashMap<Integer,String> map = new HashMap();
		map.put(1, "1");
		map.put(2,"2");
		map.put(2,"22");
		
		HashMap map2 = map;
		for(Object key:map2.keySet())
		{
			System.out.println(map2.get(key));
		}
		System.out.println(map2.get(2));
		
		Hashtable table = new Hashtable();
	}
}
