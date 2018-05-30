package Visitor;

public class VisitorA implements Visitor{

	@Override
	public void visit(NodeA node) {
		// TODO Auto-generated method stub
		System.out.println(node.operationA());
	}

	@Override
	public void visit(NodeB node) {
		// TODO Auto-generated method stub
		System.out.println(node.operationB());
	}
}
