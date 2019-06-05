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
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
