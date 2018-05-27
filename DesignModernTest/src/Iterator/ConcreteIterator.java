package Iterator;

import java.util.Vector;

public class ConcreteIterator implements Iterator{
    private Vector vector = new Vector();
    public int cursor = 0;
    
    public ConcreteIterator(Vector vector)
    {
    	this.vector = vector;
    }
    
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object result = null;
		if(hasNext())
		{
			result = vector.get(cursor++);
		}
		return result;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(this.cursor == vector.size())
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		this.vector.remove(cursor);
		return true;
	}

}
