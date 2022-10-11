package com.bridgelabz.employeeWageCompulation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Function");
		
		int wagePerHour = 20;
		int fullDayHours = 8;
		int partTimeHours = 4;
		int salary = 0;

		Random random = new Random();
		int randomNum = random.nextInt(3); // 0-1-2

		if (randomNum == 1) {
			System.out.println("Employee is present");
			salary = wagePerHour * fullDayHours;
		} else if (randomNum == 2) {
			System.out.println("Employee worked for part time");
			salary = wagePerHour * partTimeHours;
		} else
			System.out.println("Employee is absent");
		System.out.println("Employee salary is : " + salary);
	}

}