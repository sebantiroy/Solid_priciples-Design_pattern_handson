package Abstractfactory;

public class AudiFactory extends Factory{

	@Override
	HeadLight makeHeadlight() {
		// TODO Auto-generated method stub
		return new HeadLight();
	}

	@Override
	Tire makeTire() {
		// TODO Auto-generated method stub
		return new Tire();
	}

}
