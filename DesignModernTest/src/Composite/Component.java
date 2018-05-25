package Composite;

public abstract class Component {
	protected String name;
	public Component(String name)
	{
		this.name = name;
	}
	public abstract void add(Component c); //���ӳ�Ա  
    public abstract void remove(Component c); //ɾ����Ա  
    public abstract Component getChild(int i); //��ȡ��Ա  
    public abstract void operation();  //ҵ�񷽷�
}
