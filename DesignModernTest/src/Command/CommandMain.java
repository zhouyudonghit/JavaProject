package Command;

/**
 * ÃüÁîÄ£Ê½
 * @author localuser
 *
 */
public class CommandMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoker invoker = new Invoker(new MyCommand(new Receiver()));
		invoker.action();
	}
}
