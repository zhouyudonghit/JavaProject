package AbstractFactory;

public class ProductAFactory implements IFactory{

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new EngineA();
	}

	@Override
	public Aircondition createAircondition() {
		// TODO Auto-generated method stub
		return new AirconditionA();
	}

}
