package State;


/**
 * ״̬ģʽ
 * @author localuser
 *
 */
public class StateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();  
        context.setLiftState(new CloseState());  
        context.open();  
        context.close();  
        context.run();  
        context.stop();  
	}

}
