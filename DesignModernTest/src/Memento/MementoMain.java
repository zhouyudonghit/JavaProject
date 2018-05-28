package Memento;

/**
 * ±¸ÍüÂ¼Ä£Ê½
 * @author Administrator
 *
 */
public class MementoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("On");
        caretaker.saveMemento(originator.createMemento());
        originator.setState("Off");
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println(originator.getState());
//        https://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html
	}

}
