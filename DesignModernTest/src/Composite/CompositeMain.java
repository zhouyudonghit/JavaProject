package Composite;

/**
 * 组合模式,用来处理树形结构层次的对象
 * @author localuser
 *
 */
public class CompositeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component root = new Composite("root");
		root.add(new Leaf("root-leaf1"));
		root.add(new Leaf("root-leaf2"));
		
		Component compositeX = new Composite("X");
		compositeX.add(new Leaf("X-leaf1"));
		compositeX.add(new Leaf("X-leaf2"));
		root.add(compositeX);
		
		root.operation();
		
	}
}
