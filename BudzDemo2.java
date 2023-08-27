package Javademos;

public class BudzDemo2 
{

	public static void main(String[] args) 
	{
		int grossSalary = 10000;
		
		BudzDemo2 bd1 = new BudzDemo2();
		
		int netSalary = grossSalary-bd1.housecharges();
		
		System.out.println(netSalary);
		
		int taxcal = 30*bd1.housecharges();
		
		System.out.println(taxcal);
		
	}
		
		int housecharges()
		{
			
			  System.out.println("housecharges is invoking");
			  
			  int rent = 2000;
			  
			  int childfee = 1000;
			  
			  int totalcharges = rent+childfee;
			  
			  System.out.println(totalcharges);
			  
			  return(totalcharges);
		}

	

}
