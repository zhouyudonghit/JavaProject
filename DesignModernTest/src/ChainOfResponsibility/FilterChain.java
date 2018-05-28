package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	List<Filter> filters = new ArrayList<Filter>();
	private int index = 0;

	public void addFilter(Filter filter)
	{
		filters.add(filter);
	}
	
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		if(index == filters.size())
		{
			index = 0;
			return;
		}
		Filter filter = filters.get(index++);
		filter.doFilter(request, response, chain);
	}

}
