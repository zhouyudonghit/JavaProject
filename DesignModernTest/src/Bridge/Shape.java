package Bridge;

public abstract class Shape {
	protected Color color;
	protected String name;
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public abstract void draw();

}
