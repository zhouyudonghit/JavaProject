package synctest;

public abstract class Parent {
	public synchronized  void add()
	{
		System.out.println("add begin");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("add over");
	}
	
	public synchronized  void remove()
	{
		System.out.println("remove begin");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("remove over");
	}
}
