package TemplatePackage;

/**
 * ģ�巽��ģʽ
 * @author localuser
 *
 */
public class TemplateMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractCarTemplate car = new WCar();
        car.execute();
        
        car = new OCar();
        car.execute();
	}
}
