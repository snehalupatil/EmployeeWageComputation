
public class EmployeeAttendance {

	public static void main (String[] args) {
		int CheckPresence = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == CheckPresence) {						//checking whether employee is present or absent
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}


}
