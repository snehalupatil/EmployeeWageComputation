
public class TwoCompaniesWagesusingmethods {

	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	
	public static int computeEmpWage(String company, int empRatePerHour,int numOf_workingDays, int maxHrs_inMonth) {
		//Variables
		int empHours=0;
		int empWage=0;
	
		int totalWorkingDays=0;
		int totalEmpHour=0;
		//Computation
		while (totalEmpHour<=maxHrs_inMonth &&  totalWorkingDays<numOf_workingDays) {
			totalWorkingDays=totalWorkingDays+1;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {							// checking whether employee is full time ,part time or absent
				case FULL_TIME:
					empHours=8;
					break;
				case PART_TIME:
					empHours=4;
					break;
				default:
					empHours=0;
		}
			totalEmpHour=totalEmpHour+empHours;
			System.out.println("Days:"+totalWorkingDays + "  Emp Hours:" +empHours);
			
			
				
			
	}			
		int totalEmpWage=totalEmpHour*empRatePerHour;
		System.out.println("Total Employee Wage of " +company+" is : "+totalEmpWage);	//printing the employee wage
		return totalEmpWage;
		
	}
	
	public static void main(String[] args) {
		computeEmpWage("Dmart",20,4,10);
		System.out.println("--------------------------");
		computeEmpWage("Reliance",10,8,20);
	}

}


