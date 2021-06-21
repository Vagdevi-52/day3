package EmployeeWagePro;

import java.util.Random;
 class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
                int WAGE_PER_HR=20;
                int FULLDAY_HRS=8;
                int daily_wage;
                int PART_TIME=4;
                int num_of_workingdays=20;
                int max_hrs_in_month=100;
                int emphrs=0, totEmphrs=0, totWorkingdays=0;
                System.out.println("Welcome to Employee Wage Computation"); 
while(totEmphrs<=max_hrs_in_month && totWorkingdays<num_of_workingdays)
{
totWorkingdays++;

  
                //for( day=0; day<num_of_workingdays; day++)
                //{
                  //for( hr=0; hr<num_of_hr; hr++)
		  //break;
                  Random rand = new Random();
		  int random = rand.nextInt(3);
		//if (random == 1)
	         	//System.out.println("Employee-present");
                        //daily_wage=FULLDAY_HRS*WAGE_PER_HR;
		        //System.out.println("Employee wage is " +daily_wage);                
		//}


                  //else if(random ==2 )
                //{
                //System.out.println("Employee is part time");
                //daily_wage=PART_TIME*WAGE_PER_HR;
                //System.out.println("Employee wage is " +daily_wage);
              //}
                //else
              //  System.out.println("employee is absent");
            //}
         //}

switch(random)
{
case 1:
emphrs=8;
for( hr=0; hr<num_of_hr; hr++)
daily_wage=FULLDAY_HRS*WAGE_PER_HR;
System.out.println("Employee is Present ");
System.out.println("Employee wage is " +daily_wage);
break;
case 2:
emphrs=4;
System.out.println("Employee wage is " +daily_wage);
break;
default:
System.out.println("Employee is Absent");
}
totEmphrs=emphrs;
System.out.println("Day#: "+totWorkingdays +" Emp hr: "+emphrs);

}
}
}


