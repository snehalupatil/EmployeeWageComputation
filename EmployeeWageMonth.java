
public class EmployeeWageMonth {

	public static final int isFullTime=2;
	public static final int isPartTime=1;
	public static final int empRatePerHour=20;
	public static final int numOf_workingDays=20;
	public static void main (String[] args) {
		//Variables
		int empHours=0;
		int empWage=0;
		int totalEmpWage=0;
		//Computation
		for (int days=0;days<numOf_workingDays;days++) {
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
				case isFullTime:
					empHours=8;
					break;
				case isPartTime:
					empHours=4;
					break;
				default:
					empHours=0;
		}
			empWage=empHours*empRatePerHour;
			totalEmpWage=totalEmpWage+empWage;
			System.out.println("Employee Day Wage: " +empWage);		
	}			
		
		System.out.println("Total 20 Days Employee Wage: " +totalEmpWage);		//printing the employee wage
}
}



