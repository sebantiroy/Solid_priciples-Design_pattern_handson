package Abstractfactory;

public class MarcedesFactory extends Factory {
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
