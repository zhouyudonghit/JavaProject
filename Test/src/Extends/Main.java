package Extends;

import BlockingQueue.BlockingQueueTest;

public class Main {

	public static void main(String[] args) {
		Father1 father = new Father1();
		Father1 child = new Child();
		father.doSomething(new Eat());
		child.doSomething(new Drink());
	}

}

class Eat{
}
class Drink{
}

class Father1{
	public void doSomething(Eat arg){
		System.out.println("爸爸在吃饭");
	}
	public void doSomething(Drink arg){
		System.out.println("爸爸在喝水");
	}
}

class Child extends Father1{
	public void doSomething(Eat arg){
		System.out.println("儿子在吃饭");
	}
	public void doSomething(Drink arg){
		System.out.println("儿子在喝水");
	}
}