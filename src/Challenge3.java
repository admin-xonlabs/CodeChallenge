
public class Challenge3 {

	public static double computeInHandSalary(int numOfHoursWorked, double basePay)
	{
		double inHandSalary = 0;
		
		// Your Logic Here
		
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
