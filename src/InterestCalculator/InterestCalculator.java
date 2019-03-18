package InterestCalculator;

public class InterestCalculator {
	
	public double simple_interest(double principle, double rate, double time)
	{		
		return((principle*rate*time)/100);
	}
	
	public double compound_interest(double principle, double rate, double time)
	{
		return principle*(Math.pow((1+rate/100),time));
	}

}
