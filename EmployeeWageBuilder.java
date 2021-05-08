package com.empwage;

public class EmployeeWageBuilder {

	public static final int isPartTime=1;
	public static final int isFullTime=2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmployeeWageBuilder(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth) {
		//Variables
		
		this.company = company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	
	public void computeEmpWage() {
	
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		//Computation
		while (totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays) {
			totalWorkingDays=totalWorkingDays+1;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {							// checking whether employee is full time ,part time or absent
				case isFullTime:
					empHrs=8;
					break;
				case isPartTime:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs=totalEmpHrs+empHrs;
			System.out.println("Day:"+totalWorkingDays + "  Emp Hr: " +empHrs);
					
		}	
		totalEmpWage=totalEmpHrs * empRatePerHour;
		
	}	
		public String toString() {
			return "Total Emp Wage for " +company+ " is: "+totalEmpWage;
	}
	
	public static void main(String[] args) {
		EmployeeWageBuilder dmart=new EmployeeWageBuilder("DMART",20,2,10);  //creating object for dmart
		EmployeeWageBuilder reliance=new EmployeeWageBuilder("Reliance",10,4,20);  //creating a object reliance
		dmart.computeEmpWage();
		System.out.println(dmart);
		reliance.computeEmpWage();
		System.out.println(reliance);
		
	}
}