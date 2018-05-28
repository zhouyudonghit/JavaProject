package ChainOfResponsibility;

public class FaceFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		request.setRequest(request.getRequest().replace(":):","^V^")+"----FaceFilter()");
		chain.doFilter(request, response, chain);
		response.setResponse(response.getResponse()+"----FaceFilter()");
	}

}
