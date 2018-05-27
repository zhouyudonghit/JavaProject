package Iterator;

/**
 * 迭代器模式,目前已经没落的模式
 * @author Administrator
 *
 */
public class IteratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Aggregate agg = new ConcreteAggregate();
        agg.add("abc");
        agg.add(2);
        agg.add(345);
        Iterator iter = agg.iterator();
        while(iter.hasNext())
        {
        	System.out.println(iter.next());
        }
	}

}
