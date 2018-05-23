package DynamicProxy;

public class RealSubject implements Subject{
	private String name = "RealSubject";

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
