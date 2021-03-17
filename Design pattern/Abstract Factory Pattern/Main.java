package Abstractfactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("What you want for Audi 0 or Marcedes 1");
		int i=sc.nextInt();
		Factory f=client.getFactory(i);
		String r=sc.next();
		if(r.equalsIgnoreCase("tire"))
		{
			Tire t=f.makeTire();
		}
		else if(r.equalsIgnoreCase("headlight"))
		{
			HeadLight h=f.makeHeadlight();
		}
		

	}

}
