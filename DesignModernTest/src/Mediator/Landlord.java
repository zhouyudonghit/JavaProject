package Mediator;

public class Landlord extends Person{

	public Landlord(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void sendMessage(String msg) {
		// TODO Auto-generated method stub
		mediator.operation(this,msg);
	}

	@Override
	protected void getMessage(String msg) {
		// TODO Auto-generated method stub
		 System.out.println("����["+ name +"]�յ��н鷢������Ϣ��" + msg);  
	}

}
