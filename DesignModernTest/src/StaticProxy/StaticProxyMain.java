package StaticProxy;

/**
 * ��̬����
 * ���ǿ��Կ�������ģʽ���ص㣬���������һ��Subject�ӿڵĶ����κ�ʵ�ָýӿڵĶ��󣬶�����ͨ����������д���������ͨ���ԡ�����Ҳ��ȱ�㣬
 * ÿһ�������඼����ʵ��һ��ί���ࣨҲ����realsubject���Ľӿڣ�
 * ����ӿ����ӷ������������Ҳ��������޸ġ���Σ�������ÿһ���ӿڶ����Ӧһ��ί�ж������ί�ж���ǳ��࣬��̬������ͷǳ�ӷ�ף�����ʤ�Ρ�
 */
public class StaticProxyMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxySubject proxySubject = new ProxySubject(new RealSubject());
		proxySubject.visit();
	}

}
