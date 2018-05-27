package Iterator;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate{
    private Vector vector = new Vector();
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		vector.add(object);
	}

	@Override
	public void remove(Object object) {
		// TODO Auto-generated method stub
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(vector);
	}

	
}
