package State;

public class CloseState extends LiftState{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.openState);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("µÁÃ›√≈πÿ±’...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.runState);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.stopState);
		super.context.getLiftState().stop();
		
	}
	

}
