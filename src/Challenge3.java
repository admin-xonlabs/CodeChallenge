
public class Challenge3 {

	public static double computeInHandSalary(int numOfHoursWorked, double basePay)
	{
		double inHandSalary = 0;
		
		// Your Logic Here
	//=================================income tax===================================
		System.out.println("                    ");
		System.out.println("==============================================================");
		
	//==============================bonus==================================
	{
		double h= numOfHoursWorked;
		
		double v=basePay;
		
		double s1=0;
		if(h<140)  
		{
			System.out.println("total bonus=="+s1);
		}
		else {
     	 if(h>=140)
		{
		double	z=(h-140);		
			if(z<=10)
			{
				s1=(s1+(z*(v/100)*10));
			}
			else
			{
				s1=(s1+(10*(v/100)*10));
			}
		{
			if(h>=150) 
			{
			double y=(h-150);
			if(y<=10)
			{
				s1=(s1+(y*(v/100)*20));
			}
			else
			{
				s1=(s1+(10*(v/100)*20));
			}
		}
			{
				if(h>=160) 
				{
				double x=(h-160);
				if(x<=10)
				{
					s1=(s1+(x*(v/100)*30));
				}
				else
				{
					s1=(s1+(10*(v/100)*30));
				}
			}
				{
				if(h>=170) 
				{
				double u=(h-170);
					{
						s1=(s1+(u*(v/100)*40));		
				}
		}
	}
	}

}
		System.out.println("total bonus=="+s1);
}
		
     	 //=============================flexible pay============================
			double b= basePay;
			double b1=0;
			if(b<=40000)
			{
				b1=b1+0;
				System.out.println("total flexible pay =="+b1);
			}
			else if(b<=50000 )
			{
			b1=b1+((b/100)*30);
			System.out.println(" total flexible pay =="+b1);
			 else if( b<=60000)
			{
			b1=b1+((b/100)*40);
			System.out.println("total flexible pay =="+b1);
			}
			 else 
				 {
				 if(b>60000);
			{
			b1=b1+((b/100)*50);
		System.out.println("total flexible pay =="+b1);
			}
				 }
			double base=basePay;
			double gross=0;
			gross=base+ b1+s1;
			System.out.println("gross pay=="+gross);
			
			//////////////////////////
			double a= gross;		
			double s=0;
		if(a<=100000)
		{
			s=s+0;
		}
		else if(a>=100000)
		{
			double	z=(a-100000);
			
			if(z<=100000)
			{
				s=(s+((z/100)*10));
			}	
		}
		{
			 if((a>=200000) )
			{		
			double	z=(a-100000);
				if(z<=100000)
				{
					s=(s+((z/100)*10));
				}
				else
				{
					s=(s+((100000/100)*10));
				}
			 {
				if(a>=350000) 
				{
				double y=(a-200000);
				if(y<=150000)
				{
					s=(s+((y/100)*20));
				}
				else
				{
					s=(s+((150000/100)*20));
				}		
			}
				else
				{
					if(a<=350000) 
					{
					double y=(a-200000);
					if(y<=150000)
					{
						s=(s+((y/100)*20));
					}
					else
					{
						s=(s+((150000/100)*20));
					}		
				}
				}
			
				{
					if(a>350000) 
					{
					double u=(a-350000);	
						s=(s+((u/100)*30));
					}
			}		
			// TODO Auto-generated method stub
		}
			}
		}
			System.out.println("total incom tax="+s);
			///////////////////////
			
			inHandSalary=gross-s;
		}
}
		
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
