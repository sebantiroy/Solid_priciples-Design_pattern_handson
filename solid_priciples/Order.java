package solid_priciples;

public class Order implements I_order{

	@Override
	public void processOrder(String model_Name) {
		// TODO Auto-generated method stub
		System.out.println("order accepted"+ model_Name);
	}

}
