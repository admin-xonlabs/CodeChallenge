
public class Challenge3 {

	public static double computeInHandSalary(int numOfHoursWorked, double basePay)
	{
		double inHandSalary = 0;
		
		// Done By Roushan Raja from Team Tech Pirates
		//Calculating FlexiblePay
		double flexiPay = 0;
		
		if(basePay <= 40000)
		{
			flexiPay = 0;
		}
		else if(basePay > 40000 && basePay <= 50000)
		{
			flexiPay = (basePay * 30) / 100;
		}
		else if(basePay > 50000 && basePay <= 60000)
		{
			flexiPay = (basePay * 40) / 100;
		}
		else
		{
			flexiPay = (basePay * 50) / 100;
		}
//		System.out.println("Flexible Pay : "+flexiPay);
		
		//Calculating Bonus
		double bonus = 0;
		
		if(numOfHoursWorked < 140)
		{
			bonus = 0;
		}
		else
		{
			for(int i = 140, j = 0; i <= numOfHoursWorked; i++ , j++)
			{
				if(i <= 150 )
				{
					if(j == 10 || i == numOfHoursWorked)
					{
						bonus = bonus + ((basePay * 10) / 100) * j;
						j = 0;
					}
				}
				else if(i > 150 && i <= 160)
				{
					if(j == 10 || i == numOfHoursWorked)
					{
						bonus = bonus + ((basePay * 20) / 100) * j;
						j = 0;
					}
				}
				else if(i > 160 && i <= 170)
				{
					if(j == 10 || i == numOfHoursWorked)
					{
						bonus = bonus + ((basePay * 30) / 100) * j;
						j = 0;
					}
				}
				else if(i > 170)
				{
					if(i == numOfHoursWorked)
					{
						bonus = bonus + ((basePay * 40) / 100) * j;
					}
				}
			}
		}
//		System.out.println("Bonus : "+bonus);
		
		//Calculating Income Tax
		double total = basePay + flexiPay + bonus; //Total amount without tax
		double tax = 0;
		
		if(total < 100000)
		{
			tax = 0;
		}
		else
		{
			for(int i = 100000, j = 0; i <= total; i++ , j++)
			{
				if(i <= 200000)
				{
					if(i == total || j == 100000)
					{
						tax = tax + (10 * j) / 100;
						j = 0;
					}
				}
				else if(i > 200000 && i <= 350000 )
				{
					if(i == total || j == 150000)
					{
						tax = tax + (20 * j) / 100;
						j = 0;
					}
				}
				else if(i > 350000)
				{
					if(i == total)
					{
						tax = tax + (30 * j) / 100;
					}
				}
			}
		}
//		System.out.println("Tax :"+tax);
		
		//Calculating The salary In hand
		inHandSalary = basePay + flexiPay + bonus - tax;
		
		return inHandSalary;
	}
	
	public static void main (String arg[])
	{
		int hours1 = 170;
		double basePay1 = 50000;		
		System.out.println("Hours: "+hours1+", BasePay: "+basePay1+", In Hand Salary: "+computeInHandSalary(hours1, basePay1));

		int hours2 = 190;
		double basePay2 = 40000;		
		System.out.println("Hours: "+hours2+", BasePay: "+basePay2+", In Hand Salary: "+computeInHandSalary(hours2, basePay2));

		int hours3 = 140;
		double basePay3 = 60000;		
		System.out.println("Hours: "+hours3+", BasePay: "+basePay3+", In Hand Salary: "+computeInHandSalary(hours3, basePay3));

		int hours4 = 210;
		double basePay4 = 70000;		
		System.out.println("Hours: "+hours4+", BasePay: "+basePay4+", In Hand Salary: "+computeInHandSalary(hours4, basePay4));

	}
}
