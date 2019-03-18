package HouseConstructionCost;

public class HouseConstructionCost {
	
	public double calculate_cost(String material, double area, boolean fully_automated)
	{
		double cost=0.0;
		if(material.equalsIgnoreCase("Standard") && fully_automated==false)
		{
			cost = area * 1200;
			
		}
		
		if(material.equalsIgnoreCase("Above") && fully_automated==false)
		{
			cost= area * 1500;
			
		}
		
		if(material.equalsIgnoreCase("High") && fully_automated==false)
		{
			cost= area * 1800;
			
		}
		
		if(material.equalsIgnoreCase("High") && fully_automated==true)
		{
			cost= area * 2500;
			
		}
		
		if(material.equalsIgnoreCase("High")==false && fully_automated==true)
		{
			System.out.println("House Not Possible. Invalid Input");
		}
		
		return cost;
	}

}
