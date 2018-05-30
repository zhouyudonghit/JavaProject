package Visitor;

/**
 * 访问者模式
 * @author localuser
 *
 */
public class VisitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ObjectStructure os = new ObjectStructure();
        os.add(new NodeA());
        os.add(new NodeB());
        
        Visitor visitor = new VisitorA();
        os.action(visitor);
        
        
	}

}
