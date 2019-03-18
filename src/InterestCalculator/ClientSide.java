package InterestCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ClientSide {

	static DecimalFormat df = new DecimalFormat(".#");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterestCalculator ob= new InterestCalculator();
		
		Scanner sc= new Scanner(System.in);
		
		int option=1;
		
		while(option==1){
	
		System.out.println("INTEREST CALCULATOR");
		
		System.out.println("1: Calculate Simple Interest");
		System.out.println("2: Calculate Compound Interest");
		System.out.println("3: EXIT");
		
		System.out.println("Enter your choice");
		
		int op=sc.nextInt();
		
		switch(op){
		
		case 1:
		
			System.out.println("Enter Principle");
			double principle=sc.nextDouble();
			
			System.out.println("Enter Rate");
			double rate=sc.nextDouble();
			
			System.out.println("Enter Time");
			double time=sc.nextDouble();
			
			System.out.println("Simple Interest : " +df.format(ob.simple_interest(principle, rate, time)));
			break;
			
		case 2:
			
			System.out.println("Enter Principle");
			double principle2=sc.nextDouble();
			
			System.out.println("Enter Rate");
			double rate2=sc.nextDouble();
			
			System.out.println("Enter Time");
			double time2=sc.nextDouble();
			
			System.out.println("Calculated Compound Interest: " +df.format(ob.compound_interest(principle2, rate2, time2)));
			break;
			
		case 3:
			option =0;
			
			break;
				
		}
		}
		sc.close();
}
}
