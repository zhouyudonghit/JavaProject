package ChainOfResponsibility;

public class SensitiveFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
	   request.setRequest(request.getRequest().replace("����ҵ","��ҵ").replace("����","")+" ---sensitiveFilter()");
	   chain.doFilter(request, response, chain);
	   response.setResponse(response.getResponse()+" ---sensitiveFilter()");
	}

}
