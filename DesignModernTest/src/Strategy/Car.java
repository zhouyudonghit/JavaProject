package Strategy;

public abstract class Car implements CarFunction{
	protected String name;            //������
	protected String color;            //����ɫ
	
	public Car(String name, String color) {
		         this.name = name;
		        this.color = color;
		     }

}
