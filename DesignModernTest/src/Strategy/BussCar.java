package Strategy;

public class BussCar extends Car{

	public BussCar(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(color +" " + name  +"在高速的行驶。。。");
	}

}
