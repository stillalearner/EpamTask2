package HouseConstructionCost;

import java.util.Scanner;

public class ClientSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HouseConstructionCost ob= new HouseConstructionCost();
		Scanner sc= new Scanner(System.in);
        int option=1;
		
		while(option==1){
	
		System.out.println("1: FIND CONSTRUCTION COST");
		System.out.println("2: EXIT");
		System.out.println("Enter your choice");
		int op=sc.nextInt();
		
		switch(op){
		
		case 1:
			
			System.out.println("Enter material type");
			String material=sc.next();
			
			System.out.println("Enter area of house");
			double area=sc.nextDouble();
			
			System.out.println("Do you want fully automated house? (Yes/No)");
			
			String fullyautomated=sc.next();
			boolean fully_automated;
			if(fullyautomated.equalsIgnoreCase("yes"))
			{
				fully_automated= true;
			}
			else
			{
				fully_automated= false;
			}
			
			System.out.println("House Construction Cost: " +ob.calculate_cost(material, area, fully_automated));
			break;
			
		case 2:
			option=0;
			break;				
		}
	}	
		sc.close();
	}
}
