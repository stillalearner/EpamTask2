package HouseConstructionCost;

import java.util.Scanner;

public class ClientSide_cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructionCost ob= new ConstructionCost();
		Scanner sc= new Scanner(System.in);
        int option=1;
        System.out.println("****************Cost Calculator*****************");
		while(option==1){
		System.out.println("1: CONSTRUCTION COST");
		System.out.println("2: EXIT");
		System.out.println("Enter your choice");
		int op=sc.nextInt();
		
		switch(op){
		case 1:
		{
			System.out.println("material type");
			String material=sc.next();
			System.out.println("area of house");
			double area=sc.nextDouble();
			System.out.println("fully automated house? (Yes/No)");
			String fullyautomated=sc.next();
			boolean fully_automated;
			if(fullyautomated.equalsIgnoreCase("yes")){	fully_automated= true;}
			else
			{
				fully_automated= false;
			}
			System.out.println("House Construction Cost for user is:  " +ob.calculate_cost(material, area, fully_automated));
			break;
		}
		case 2:
		{
			option=0;
			break;				
		}
		default:
		{
			System.out.println("Invalid :");
			break;
		}
		}
	}	
		sc.close();
	}
}
