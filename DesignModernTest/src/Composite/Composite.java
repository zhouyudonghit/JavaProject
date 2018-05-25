package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	private List<Component> childList = new ArrayList<>(); 

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		childList.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		childList.remove(c);
		
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return childList.get(i);
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(Component component:childList)
		{
			component.operation();
		}
	}

}
