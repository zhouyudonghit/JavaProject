package Strategy;

public abstract class Car implements CarFunction{
	protected String name;            //车名字
	protected String color;            //车颜色
	
	public Car(String name, String color) {
		         this.name = name;
		        this.color = color;
		     }

}
