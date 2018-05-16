package FactoryMethod;

public class FactoryBMW320 implements FactoryBMW{

	@Override
	public BMW createBMW() {
		// TODO Auto-generated method stub
		return new BMW320();
	}

}
