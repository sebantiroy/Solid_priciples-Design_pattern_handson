package solid_priciples;

public class AccessoryRepair implements I_repair_accessory  {
	@Override
	public void processAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println("repair accepted"+accessoryType);
	}
}
