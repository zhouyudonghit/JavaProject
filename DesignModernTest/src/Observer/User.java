package Observer;

public class User implements Observer{
    private String name;
    
    public User(String name)
    {
    	this.name = name;
    }
    
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name + " 收到推送消息： " + message);
	}

}
