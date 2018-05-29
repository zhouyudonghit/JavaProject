package State;

public class StopState extends LiftState{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
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
		super.context.setLiftState(Context.runState);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("µÁÃ›Õ£÷π¡À...");
	}

}
