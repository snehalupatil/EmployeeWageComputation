
public class PartTimeEmployeeWage {

	public static void main(String[] args) {
	
		int isPartTime=1;
		int emp_rate_per_hour=20;
		int empHours=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%2;		////computation of random number to check shift
		
		if  (empCheck==isPartTime){
			empHours=8;
		}
		else {
			empHours=0;
		}
		empWage=empHours*emp_rate_per_hour;
		System.out.println("Employee Wage: " +empWage);	

	}

}
