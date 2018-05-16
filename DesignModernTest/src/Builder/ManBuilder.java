package Builder;

public class ManBuilder implements Builder{
	private Person person;
	
	public ManBuilder()
	{
		person = new Person();
	}

	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("建造男人头部");
	}

	
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("建造男人身体");
	}

	
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("建造男人脚");
	}

	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}
	
}
