package BlackMemento;

/**
 * 黑箱备忘录模式,负责人角色看不到备忘录的数据
 * @author localuser
 *
 */
public class BlackMemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("On");
        caretaker.saveMemento(originator.createMemento());
        originator.setState("Off");
        originator.restoreMemento(caretaker.retrieveMemento());
	}

}
