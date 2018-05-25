package Composite;

public abstract class Component {
	protected String name;
	public Component(String name)
	{
		this.name = name;
	}
	public abstract void add(Component c); //增加成员  
    public abstract void remove(Component c); //删除成员  
    public abstract Component getChild(int i); //获取成员  
    public abstract void operation();  //业务方法
}
