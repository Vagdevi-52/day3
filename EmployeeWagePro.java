package EmployeeWagePro;

import java.util.Random;
 class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
                int WAGE_PER_HR=20;
                int FULLDAY_HRS=8;
                int daily_wage;
                int PART_TIME=4;
		Random rand = new Random();
		int random = rand.nextInt(2);
		if (random == 1){

	         	System.out.println("Employee-present");
                        daily_wage=FULLDAY_HRS*WAGE_PER_HR;
		        System.out.println("Employee wage is " +daily_wage);                
		}
                  else if(random ==2 )
                {
                System.out.println("Employee is part time");
                daily_wage=PART_TIME*WAGE_PER_HR;
                System.out.println("Employee wage is " +daily_wage);
              }
                else
                System.out.println("employee is absent");
            }
         }



