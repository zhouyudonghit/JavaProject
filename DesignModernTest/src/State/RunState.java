package State;

public class RunState extends LiftState{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����������....");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.stopState);
		super.context.getLiftState().stop();
	}

}
