package FacadePattern;

import java.util.Scanner;

public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        ShapeMaker sm=new ShapeMaker();
        boolean flag=true;
        do {
        	System.out.println("Enter 1 for Circle");
        	System.out.println("Enter 2 for Rectangle");
        	System.out.println("Enter 3 for Square");
        	System.out.println("Enter 4 for exit");
        	System.out.println("Enter your choice");
        	int ch=sc.nextInt();
        	switch(ch)
        	{
        	case 1:
        		sm.drawCircle();
        		break;
        	case 2:
        		sm.drawRectangle();
        		break;
        	case 3:
        		sm.drawSquare();
        		break;
        	case 4:
        		System.out.println("Nothig is drawn");
        		flag=false;
        		break;
        	 default:
        		System.out.println("Invalid option");
        	}
        	
        }while(flag);
	}

}
