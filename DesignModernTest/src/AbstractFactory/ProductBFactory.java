package AbstractFactory;

public class ProductBFactory implements IFactory{

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new EngineB();
	}

	@Override
	public Aircondition createAircondition() {
		// TODO Auto-generated method stub
		return new AirconditionB();
	}

}
