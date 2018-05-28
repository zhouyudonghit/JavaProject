package ChainOfResponsibility;


/**
 * ������ģʽ
 * ������ģʽ��һ�ֶ������Ϊģʽ����������ģʽ��ܶ������ÿһ����������¼ҵ����ö����������γ�һ������������������ϴ��ݣ�
 * ֱ�����ϵ�ĳһ�����������������󡣷����������Ŀͻ��˲���֪�����ϵ���һ���������մ������������ʹ��ϵͳ�����ڲ�Ӱ��ͻ��˵�����¶�̬��������֯�ͷ������Ρ�
 * @author localuser
 *
 */
public class ChainMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg = ":):,<script>,����,����ҵ,�����ڿ�";
        Request request = new Request();
        request.setRequest(msg);
        Response response = new Response();
        response.setResponse("response:");
        
        FilterChain chain = new FilterChain();
        chain.addFilter(new HTMLFilter());
        chain.addFilter(new SensitiveFilter());
        chain.addFilter(new FaceFilter());
        
        chain.doFilter(request, response, chain);
      //��ӡ������Ϣ
                 System.out.println(request.getRequest());
                 //��ӡ��Ӧ��Ϣ
                 System.out.println(response.getResponse());
	}

}
