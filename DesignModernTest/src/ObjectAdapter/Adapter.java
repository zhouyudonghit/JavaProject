package ObjectAdapter;

/**
 * ����������ģʽ��ͨ�����ʵ��
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
