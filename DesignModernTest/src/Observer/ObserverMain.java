package Observer;

/**
 * �۲���ģʽ��java���Դ��Ĺ۲���ģʽ
 * @author localuser
 *
 */
public class ObserverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeChatServer server = new WeChatServer();
        
        Observer user1 = new User("user1");
        Observer user2 = new User("user2");
        Observer user3 = new User("user3");
        
        server.registerObserver(user3);
        server.registerObserver(user2);
        server.registerObserver(user1);
        
        server.setInfomation("�ż���");
	}

}
