package FactoryMethod;

public class FactoryBMW523 implements FactoryBMW{

	@Override
	public BMW createBMW() {
		// TODO Auto-generated method stub
		return new BMW523();
	}
}