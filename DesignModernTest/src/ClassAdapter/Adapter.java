package ClassAdapter;

/**
 * 类适配器，通过继承实现
 * @author localuser
 *
 */
public class Adapter extends Usber implements Ps2{

	@Override
	public void isPs2() {
		// TODO Auto-generated method stub
		isUsb();
	}

}
