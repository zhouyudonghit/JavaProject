package ChainOfResponsibility;

public class SensitiveFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
	   request.setRequest(request.getRequest().replace("被就业","就业").replace("敏感","")+" ---sensitiveFilter()");
	   chain.doFilter(request, response, chain);
	   response.setResponse(response.getResponse()+" ---sensitiveFilter()");
	}

}
