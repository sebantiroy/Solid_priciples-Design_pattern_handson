package ChainOfResponsibility;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		IleaveRequestHandler i=new HR();
		IleaveRequestHandler i1=new Supervisor();
		IleaveRequestHandler i2=new ProjectManager();
		i.SetnextHandler(i1);
		i1.SetnextHandler(i2);
		
		System.out.println("Enter your name");
		String name=sc.next();
	    System.out.println("Yow want to take leaves for how many days");
		int days=sc.nextInt();
		LeaveRequest lr=new LeaveRequest(days,name);
		i.HandleRequest(lr);
	}

}
