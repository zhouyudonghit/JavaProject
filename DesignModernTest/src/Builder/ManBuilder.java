package Builder;

public class ManBuilder implements Builder{
	private Person person;
	
	public ManBuilder()
	{
		person = new Person();
	}

	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("��������ͷ��");
	}

	
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("������������");
	}

	
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("�������˽�");
	}

	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}
	
}
