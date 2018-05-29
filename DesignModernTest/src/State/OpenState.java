package State;

public class OpenState extends LiftState{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("µçÌÝÃÅ¿ªÆô...");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.closeState);
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
