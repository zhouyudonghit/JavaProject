package Observer;

import java.util.ArrayList;
import java.util.List;

public class SyncWeChatServer implements IObserverable{
	private List<IObserver> list = new ArrayList<>();
    private String message;
    
	@Override
	public synchronized void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		list.add(o);
	}
	@Override
	public synchronized void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		list.remove(o);
		
	}
	@Override
	public synchronized void notifyObserver() {
		// TODO Auto-generated method stub
		for(IObserver o:list)
		{
			o.update(message);
		}
	}
	public void setInfomation(String s) {
        this.message = s;
        System.out.println("΢�ŷ��������Ϣ�� " + s);
        //��Ϣ���£�֪ͨ���й۲���
        notifyObserver();
    }
}
