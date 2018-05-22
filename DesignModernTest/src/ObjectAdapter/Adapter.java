package ObjectAdapter;

/**
 * 对象适配器模式，通过组合实现
 * @author localuser
 *
 */
public class Adapter implements Ps2{
    private Usb mUsber;  
    
    public Adapter(Usb usb)
    {
    	mUsber = usb;
    }
    
	@Override
	public void isPs2() {
		// TODO Auto-generated method stub
		mUsber.isUsb();
	}

}
