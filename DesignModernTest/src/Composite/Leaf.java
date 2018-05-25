package Composite;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
