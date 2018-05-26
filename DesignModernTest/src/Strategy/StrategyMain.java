package Strategy;

/**
 * 策略模式
 * @author localuser
 *
 */
public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car smallcar = new SmallCar("路虎","黑色");
        Car busscar = new BussCar("公交车","白色");
        
        Person p1 = new Person("小明",20);
        p1.drive(smallcar);
        p1.drive(busscar);
	}

}
