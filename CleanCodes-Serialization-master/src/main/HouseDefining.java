
public class HouseDefining {
	double ab=0;
	double cost(String s,double r,String y)
	{
		if (s.equals("StandardMaterials"))
		{
			
			ab=ab+(1200*r);
			
			
		}
		
		else if (s.equals("above standard materials"))
		{
			
			ab=ab+(1500*r);
			
			
		}
		else
		{
			if (y.equals("fully automated home" ))
			{ab=ab+(2500*r);
			}
			else
			{
				ab=ab+(1800*r);
			}
			
		}
		
		
	return(ab);	
	}

}
