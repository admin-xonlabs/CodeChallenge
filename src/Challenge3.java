
public class Challenge3 {

	public static double computeInHandSalary(int numOfHoursWorked, double basePay)
	{
		double inHandSalary = 0;
		
		// Your Logic Here
		class Helper{
				public double computeflexiblepay(double b) {

			double flex = 0.0;
			if(b < 40000) {
				flex = 0.0;
			}else if(b >= 40000 && b < 50000) {
				flex = 30 * b / 100; 
			}else if(b >= 50000 && b < 60000) {
				flex = 40 * b / 100;
			}else {
				flex = 50 * b / 100;
			}
	//		System.out.println(flex);
			return flex;
		}
		public double computebonus(int w, double q) {

			double bonus = 0.0;
			double a = 0.0;
			double b = 0.0;
			double c = 0.0;
			double d = 0.0;
			if(w <= 140) {
				return bonus;
			}else {
				if(w > 140 && w < 150) {
					a = w - 140;
				}else if(w >= 150 && w < 160) {
					a = 10;
					b = w - 150;
				}else if(w >= 160 && w < 170) {
					a = 10;
					b = 10;
					c = w - 160;
				}else if(w >= 170) {
					a = 10;
					b = 10;
					c = 10;
					d = w - 170;
				}
			}
			bonus = q * (a * 10 / 100) + (b * 20 / 100) + (c * 30 / 100) + (d * 40 / 100);
	//		System.out.println(bonus);
			return bonus;
		}
		public double computetax(double gross) {

			double tax = 0.0;
			double a = 0.0;
			double b = 0.0;
			double c = 0.0;
			if(gross < 100000) {
				return tax;
			}else {
				if(gross >= 100000 && gross < 200000) {
					a = gross - 100000;
				}else if(gross >= 200000 && gross < 350000) {
					a = 100000;
					b = gross - 200000;
				}else if(gross >= 350000) {
					a = 100000;
					b = 150000;
					c = gross - 350000;
				}
				tax = (a * 10 / 100 + b * 20 / 100 + c * 30 / 100);
// 				System.out.println(tax);
			}
			return tax;
			}
		}
		Helper h = new Helper();	
		
		
		double flex = h.computeflexiblepay(basePay);
		double bonus = h.computebonus(numOfHoursWorked,basePay);
		double gross_salary = basePay + flex + bonus;
		inHandSalary = gross_salary - h.computetax(gross_salary);
		
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
