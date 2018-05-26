package Strategy;

public class SmallCar extends Car{

	public SmallCar(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(color +" " + name  +"在高速的行驶。。。");
	}

}
