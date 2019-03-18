package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientSide {

	public static void main(String[] args) {
		
		Calculator ob= new Calculator();
		int option=1;
		
		Scanner sc= new Scanner(System.in);
		
		
		while(option==1){

		System.out.println("CALCULATOR");
		
		System.out.println("1: Add Numbers");
		
		System.out.println("2: Multiply Numbers");
		
		System.out.println("3: Divide 2 numbers");
		
		System.out.println("4: EXIT");
		
		System.out.println("Enter your choice");
		
		int op=sc.nextInt();
		
		switch(op){
		
		case 1:
			System.out.println("How many numbers do you want to add?");
			int n1=sc.nextInt();
			
			ArrayList<Integer> list1 = new ArrayList<>();
			
			System.out.println("Enter numbers");
			
			for(int i=0; i<n1; i++)
			{
				list1.add(sc.nextInt());
			}
			
			System.out.println("Sum of all the numbers: " +ob.add_numbers(list1));
			break;
			
		case 2:
			System.out.println("How many numbers do you want to multiply?");
			int n2=sc.nextInt();
			
			ArrayList<Integer> list2 = new ArrayList<>();
			
			System.out.println("Enter numbers");
			
			for(int i=0; i<n2; i++)
			{
				list2.add(sc.nextInt());
			}
			
			System.out.println("Sum of all the numbers: " +ob.multiply_numbers(list2));
			break;
			
		case 3:
			
			System.out.println("Enter first number");
			
			int n3=sc.nextInt();
			
			System.out.println("Enter second number");
			
			int n4=sc.nextInt();
			
			System.out.println("Result is: " +ob.division_two_numbers(n3, n4));
			
			break;
			
		case 4:
			
			option =0;
			
			break;
				
		}
		
		}
		sc.close();

		
		
	}
		
}
	

