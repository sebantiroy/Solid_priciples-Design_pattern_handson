package solid_priciples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Welcome to our site...Would you like to order or repair");
     String processOPtion=sc.next();
	
  switch(processOPtion)
  {
  case "order":
	  Order o=new Order();
      System.out.println("provide the phone model name");
      String phoneModel=sc.next();
      o.processOrder(phoneModel);
      break;
  case "repair":
	  
	  System.out.println("Is it the phone or accessory you want to repair");
	  String P_type=sc.next();
	  if(P_type.equals("phone"))
	  {
		  Repair r=new Repair();
		  System.out.println("please provide the phone model name");
		  String model=sc.next();
		  r.ProcessPhoneRepair(model);
	  }
	  else
	  {
		  AccessoryRepair a=new AccessoryRepair();
		  System.out.println("Please provide the accessory details");
		 String  P_details=sc.next();
		 a.processAccessoryRepair(P_details);
	  }
	  
  }
 
}
}
