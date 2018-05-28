package ChainOfResponsibility;

public class HTMLFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		request.setRequest(request.getRequest().replace('<', '[').replace('>', ']')+"----HTMLFilter()");
		chain.doFilter(request, response, chain);
		response.setResponse(response.getResponse()+"---HTMLFilter()");
	}

	
}
