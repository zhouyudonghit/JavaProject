package ChainOfResponsibility;


/**
 * 责任链模式
 * 责任链模式是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。请求在这个链上传递，
 * 直到链上的某一个对象决定处理此请求。发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。
 * @author localuser
 *
 */
public class ChainMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg = ":):,<script>,敏感,被就业,网络授课";
        Request request = new Request();
        request.setRequest(msg);
        Response response = new Response();
        response.setResponse("response:");
        
        FilterChain chain = new FilterChain();
        chain.addFilter(new HTMLFilter());
        chain.addFilter(new SensitiveFilter());
        chain.addFilter(new FaceFilter());
        
        chain.doFilter(request, response, chain);
      //打印请求信息
                 System.out.println(request.getRequest());
                 //打印响应信息
                 System.out.println(response.getResponse());
	}

}
