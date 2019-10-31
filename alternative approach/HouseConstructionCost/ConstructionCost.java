package HouseConstructionCost;

public class ConstructionCost {
	
	public double calculate_cost(String material, double area, boolean fully_automated)
	{
		double cost=0.0;
		double factor=0.0;
		if(material.equalsIgnoreCase("Standard") && fully_automated==false){          factor=1200.0;	}
		if(material.equalsIgnoreCase("Above") && fully_automated==false)	{		factor=1500.0;			}
		if(material.equalsIgnoreCase("High") && fully_automated==false)	{		factor=1800.0;		}
		if(material.equalsIgnoreCase("High") && fully_automated==true){	     factor=2500.0;	}
		if(material.equalsIgnoreCase("High")==false && fully_automated==true)
		{
			System.out.println("House Not Possible. Invalid Input");
		}
     	cost=area*factor;
		return cost;
	}

}
