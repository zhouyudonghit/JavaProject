package Visitor;

public class NodeA extends Node{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	public String operationA()
	{
		return "NodeA";
	}

}
