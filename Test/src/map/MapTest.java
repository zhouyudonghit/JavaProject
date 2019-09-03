package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

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
	
	public void test1()
	{
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>(3);
		map.put("1", "1");
		map.put("1", "1");
		System.out.print(map.size());
		TreeMap<String,String> map2;
	}
}
