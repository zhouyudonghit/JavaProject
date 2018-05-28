package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeChatServer implements Observerable{
	private List<Observer> list = new ArrayList<>();
    private String message;
    
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		list.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o:list)
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
