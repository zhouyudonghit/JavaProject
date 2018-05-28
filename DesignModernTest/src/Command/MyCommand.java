package Command;

public class MyCommand implements Command{
    private Receiver receiver;
    
    public MyCommand(Receiver receiver)
    {
    	this.receiver = receiver;
    }
    
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
