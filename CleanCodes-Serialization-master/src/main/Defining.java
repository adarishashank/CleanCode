
import java.lang.*;
public class Defining {
	
	
	
	public double simple(double prin,double  in,double  per )
	{
		double sha=(prin*in*per)/100;
		
		return sha;
	}
	public double  compound(double p,double  in,double  per )
	{
		double  sha=p*(Math.pow((1+(in/100)),per));
		sha=sha-p;
		return sha;
	}
	

}
