package synctest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent p = new Son();
        Parent p1 = new Son1();
        Parent p2 = new Son();
        Son son = new Son();
        Son1 son1 = new Son1();
        new Thread(new Runnable()
        		{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						son.add();
					}
        	
        		}).start();
        new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				son1.add();
			}
	
		}).start();
	}

}
