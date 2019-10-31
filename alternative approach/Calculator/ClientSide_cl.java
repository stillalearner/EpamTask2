package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientSide_cl {

	public static void main(String[] args) {
		
		Calculator ob= new Calculator();
		Scanner sc= new Scanner(System.in);
		int option=1;
		while(option==1){

		System.out.print("************Custom Calculator***********\n\n");
		System.out.print("1: Add Numbers\n");
		System.out.print("2: Multiply Numbers\n");
		System.out.print("3: Divide 2 numbers\n");
		System.out.print("4: EXIT\n");
		System.out.print("Enter your choice\n");
		int option_check=sc.nextInt();
		
		switch(option_check)
		{
		case 1:
		{
			System.out.print("how many numbers: ");
			int n1=sc.nextInt();
			ArrayList<Integer> list1 = new ArrayList<>();
			System.out.print("Enter numbers \n");
			for(int i=0; i<n1; i++){list1.add(sc.nextInt());}
			System.out.println("Sum of all the numbers: " +ob.add_numbers(list1));
			break;
		}	
		case 2:
		{
			System.out.print("how many numbers: ");
			int n1=sc.nextInt();
			ArrayList<Integer> list1 = new ArrayList<>();
			System.out.print("Enter numbers \n");
			for(int i=0; i<n1; i++){list1.add(sc.nextInt());}
			System.out.println("Product of all the numbers: " +ob.multiply_numbers(list1));
			break;
		}	
		case 3:
		{
			System.out.println("Enter first number");
			int n3=sc.nextInt();
			System.out.println("Enter second number");
			int n4=sc.nextInt();
			System.out.println("Division is: " +ob.division_two_numbers(n3, n4));
			break;
		}
		case 4:
		{
			option =0;
			break;	
		}
		}
		
		}
		sc.close();
	}
		
}
	

