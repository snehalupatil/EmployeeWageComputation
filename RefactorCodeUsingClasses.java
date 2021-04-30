
public class RefactorCodeUsingClasses {

	
		public static final int isFullTime=2;
		public static final int isPartTime=1;
		public static final int empRatePerHour=20;
		public static final int numOf_workingDays=20;
		public static final int maxHrs_inMonth=100;
		
		public static int computeEmpWage() {
			//Variables
			int empHours=0;
			int empWage=0;
			int totalEmpHour=0;
			int totalWorkingDays=0;
			int totalEmpWage=0;
			//Computation
			while (totalEmpHour<=maxHrs_inMonth &&  totalWorkingDays<numOf_workingDays) {
				totalWorkingDays=totalWorkingDays+1;
				int empCheck = (int) Math.floor(Math.random()*10)%3;
				switch (empCheck) {							// checking whether employee is full time ,part time or absent
					case isFullTime:
						empHours=8;
						break;
					case isPartTime:
						empHours=4;
						break;
					default:
						empHours=0;
			}
				totalEmpHour=totalEmpHour+1;
				empWage=empHours*empRatePerHour;		// wage for a single day
				totalEmpWage=totalEmpWage+empWage;
				//System.out.println("Emp Wage: " +empWage);	
				
		}			
			
			System.out.println("Total employee wage: " +totalEmpWage);	//printing the employee wage
			return totalEmpWage;
			
		}
		
		public static void main(String[] args) {
			computeEmpWage();
		}

}


