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
		person.setHead("����Ů��ͷ��");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("����Ů������");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("����Ů�˽�");
		
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}

}
