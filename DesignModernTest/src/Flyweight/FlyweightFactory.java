package Flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable flyweights = new Hashtable();
	
	public FlyweightFactory(){}
	
	public Flyweight getFlyWeight(Object object)
	{
		Flyweight flyweight = (Flyweight) flyweights.get(object);
		if(flyweight == null)
		{
			flyweight = new ConcretFlyweight((String)object);
			flyweights.put(object,flyweight);
		}
		return flyweight;
	}
	
	public int getFlyweightSize()
	{
		return flyweights.size();
	}
}    
