package Flyweight;

public class ConcretFlyweight extends Flyweight{
	private String string;
	
	public ConcretFlyweight(String str)
	{
		string = str;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("Concrete---Flyweight : "+string);
	}

}
