package Memento;

/**
 * ����¼ģʽ
 * ����¼��������Ч�Ľӿڣ�

�����񡡡�խ�ӿڣ������ˣ�Caretaker�����󣨺������������˶���֮����κζ��󣩿������Ǳ���¼��խ�ӿ�(narrow interface)��
                 ���խ�ӿ�ֻ�������ѱ���¼���󴫸������Ķ���
�����񡡡���ӿڣ��븺���˶��󿴵���խ�ӿ��෴���ǣ������˶�����Կ���һ����ӿ�(wide interface)�������ӿ���������ȡ���е����ݣ�
                 �Ա������Щ���ݻָ���������˶�����ڲ�״̬��
  �ð��ǰ��䱸��¼ģʽ
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
	}

}
