package Memento;

/**
 * 备忘录模式
 * 备忘录有两个等效的接口：

　　●　　窄接口：负责人（Caretaker）对象（和其他除发起人对象之外的任何对象）看到的是备忘录的窄接口(narrow interface)，
                 这个窄接口只允许它把备忘录对象传给其他的对象。
　　●　　宽接口：与负责人对象看到的窄接口相反的是，发起人对象可以看到一个宽接口(wide interface)，这个宽接口允许它读取所有的数据，
                 以便根据这些数据恢复这个发起人对象的内部状态。
  该包是白箱备忘录模式
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
