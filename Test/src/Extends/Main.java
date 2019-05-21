package Extends;

import BlockingQueue.BlockingQueueTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println(Son.data);
        //System.out.println(Son1.data);
        //System.out.println(Father.data);
        
        //new Test().test2();
        
//        Father f = new Son();
//        f.test();
        
//        Wine a = new JNC();
//        a.fun1();
        
        JNC jnc = new JNC();
        Object obj = new Object();
        jnc.fun3(obj);
        System.out.println(obj);
	}

}
