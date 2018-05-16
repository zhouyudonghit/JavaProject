package Builder;

public class WomanBuilder implements Builder{
    private Person person;
    
    public WomanBuilder()
    {
    	person = new Person();
    }
    
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("建造女人头部");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("建造女人身体");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("建造女人脚");
		
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}

}
