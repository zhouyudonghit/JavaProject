package BlackMemento;

/**
 * ���䱸��¼ģʽ,�����˽�ɫ����������¼������
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
