package Strategy;

/**
 * ����ģʽ
 * @author localuser
 *
 */
public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car smallcar = new SmallCar("·��","��ɫ");
        Car busscar = new BussCar("������","��ɫ");
        
        Person p1 = new Person("С��",20);
        p1.drive(smallcar);
        p1.drive(busscar);
	}

}
