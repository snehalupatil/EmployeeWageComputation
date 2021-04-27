
public class DailyEmployeeWage {

	public static void main(String[] args) {
		int isFullTime=1;
		int emp_rate_per_hour=20;
		int empHours=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%2;   //computation to generate random for employee shift
		if (empCheck == isFullTime) {
			empHours=8;
		}
		else {
			empHours=0;
		}
		empWage=empHours*emp_rate_per_hour;
		System.out.println("Employee Wage: " +empWage);
	}

}
