
public class Challenge3 {
	
	    public static double computeInHandSalary(int numOfHoursWorked, double basePay) {
	        double inHandSalary = 0;
	
	        // Your Logic Here
	        double flexPay = 0,grossPay=0;
	        double bonus = 0, bonus1 = 0, bonus2 = 0, bonus3 = 0, bonus4 = 0;
	        double totalTax=0,s1=0,s2=0,s3=0,s4=0,newPay=0;
	
	
	        // calculating Flexible Payment
	        //For reference to the reader:
	//        FlexiblePay
	//        basepay	< 40 K
	//                flexipay = 0
	//        basepay > 40K and < 50K
	//                flexipay = 30% of Basepay
	//        basepay > 50K and < 60K
	//                flexipay = 40% of basepay
	//        basepay > 60K
	//                flexipay = 50% of basepay
	        if (basePay <= 40000)
	            flexPay = 0;
	        else if (basePay > 40000 && basePay <= 50000)
	            flexPay = 0.30 * basePay;
	        else if (basePay > 50000 && basePay <= 60000)
	            flexPay = 0.40 * basePay;
	        else if(basePay > 60000)
	            flexPay = 0.50 * basePay;
	
	
	        //Calculating Bonus Amount
	        //For Reference to the reader:
	//        hours < 140
	//        bonus = 0
	//        140 < hours > 150
	//        bonus = 10% basepay * hours_eligible
	//        150 < hours > 160
	//        bonus = 20% basepay * hours_eligible
	//        160 < hours > 170
	//        bonus = 30% basepay * hours_eligible
	//        170 < hours
	//        bonus = 40% basepay * hours_eligible
	        if (numOfHoursWorked <= 140)
	            bonus = 0;
	        else {
	            if (numOfHoursWorked > 140) {
	                bonus1 = 0.1 * basePay;
	                if ((numOfHoursWorked - 140) >= 10)
	                    bonus1 = bonus1 * 10;
	                else
	                    bonus1 = bonus1 * Math.abs(numOfHoursWorked - 150);
	            }
	            if (numOfHoursWorked >= 150) {
	                bonus2 = 0.2 * basePay;
	                if ((numOfHoursWorked - 150) >= 10)
	                    bonus2 = bonus2 * 10;
	                else
	                    bonus2 = bonus2 * Math.abs(numOfHoursWorked - 160);
	            }
	            if (numOfHoursWorked >= 160) {
	                bonus3 = 0.3 * basePay;
	                if ((numOfHoursWorked - 160) >= 10)
	                    bonus3 = bonus3 * 10;
	                else
	                    bonus3 = bonus3 * Math.abs(numOfHoursWorked - 170);
	            }
	            if ((numOfHoursWorked > 170))
	                bonus4 = 0.4 * basePay * Math.abs(numOfHoursWorked - 170);
	            bonus = bonus1 + bonus2 + bonus3 + bonus4;
	        }
	            //System.out.print(bonus);
	
	
	
	            //Calculating Income Tax
	            //For reference to the reader:
	//            slab 1	 < 1lakh
	//                    tax = 0
	//            slab 2	1Lac to 2 lac
	//                    tax = 10%
	//                    slab 3      2lac to 3.5 lac
	//                    tax = 20%
	//                    slab 4     > 3.5 lac
	//                    tax = 30%
	            //example:
	//            gross = 3.3 lacs
	//                    s1 = 0
	//            s2 = 1lc * 10% = 10k
	//                    s3 = 1.3lc * 20% = 26k
	//                    net = 2.94 lacs
	            grossPay=basePay+flexPay+bonus;
	            if(grossPay<=100000) {
	                s1 = 0;
	            }
	            else{
	                newPay=grossPay-100000;
	                if(grossPay>100000){
	                    if((newPay-100000)>=100000) {
	                        s2 = 0.1 * 100000;
	                        newPay-=100000;
	                    }
	                    else
	                        s2=0.1 * (newPay);
	                }
	                if(grossPay>200000){
	                    if((newPay-150000)>=150000) {
	                        s3 = 0.2 * 150000;
	                        newPay-=15000;
	                    }
	                    else
	                        s3=0.2 * (newPay);
	                }
	                if(grossPay>350000) {
	                    s4 = 0.3 * newPay;
	                }
	            }
	            totalTax=s1+s2+s3+s4;
	            inHandSalary = grossPay - totalTax;
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
