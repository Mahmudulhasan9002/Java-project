package java_prectise;

import java.util.Scanner;

public class Employee_Salary {

	
	static String emaployeename;
	static double totalhour;
	static double hourlyrate;
	static double totalsalary;
	static double texpay;
	static double spaid;
	
	public static void Welcometext() {
	System.out.println("Welcome to employee salary calculator");
	System.out.println("Please follow the promot .......");
	}
	
	public static Scanner TakeInput() {
		return new Scanner(System.in);
		
	}
	
	public static void GetInput() {
		Scanner myscanner = TakeInput();
		System.out.println("Enter employee name :");
		emaployeename = myscanner.nextLine();
		int trycount=1;
		char isinputcorrect ='N';
		
		
		//try {
		
		do {
		try {
			System.out.println("Enter total hour :");
			totalhour =myscanner.nextDouble();
			if(totalhour >=0 && totalhour <100) {
				isinputcorrect='Y';
				
			}else {
				System.out.println("enter input between 0 to 100 ....");
				System.out.println("you enterd "+totalhour);
				isinputcorrect='N';
				//System.exit(0);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("please enter the correct input ....");
			trycount++;
			//System.exit(0);
		}
		if(trycount<5) {
			System.out.println("Please ran the program again. put the valid password");
			//System.exit(0);
		}
		}while(isinputcorrect=='Y');
		
		
		
		try {
			System.out.println("Enter hour rate :");
			hourlyrate =myscanner.nextDouble();
			if(hourlyrate >=0 && hourlyrate <=15) {
				isinputcorrect='Y';
			}else {
				System.out.println("Enter right input beetween 0 to 15....");
				System.out.println("You Entered :"+hourlyrate);
				isinputcorrect='N';
				System.exit(0);

			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please put the correct input ......");
			trycount++;
			System.exit(0);
		
	}
		
	}
	public static void CalculateSalary() {
		totalsalary=totalhour*hourlyrate;
	}
	public static void CalculateTex() {
		if(totalsalary<1500) {
			texpay=totalsalary*.15;
		}else if(totalsalary >=1500 && totalsalary <3000){
			texpay=totalsalary*.20;
		}else if(totalsalary>=3000 && totalsalary <4500) {
			texpay =totalsalary*.30;
		}else if(totalsalary>=4500 && totalsalary <6000) {
			texpay= totalsalary*.40;
		}else if(totalsalary <=6000) {
			texpay=totalsalary*.50;
		}
	}
	public static void SalaryTobePaid() {
		spaid = totalsalary -texpay;
		
	}
	public static void DisplayOutPut() {
		System.out.println("Enter Employee name :"+emaployeename);
		System.out.println("employee total hour :"+totalhour);
		System.out.println("employee hourly rate :"+hourlyrate);
	
		System.out.println("****************************************");
		System.out.println("total salary :"+ totalsalary);
		System.out.println("Enter pay tex :"+texpay);
		System.out.println("emplpyee total salary to be paid : "+spaid);
		
		
	}
	
	
	public static void main(String[] args) {
		Welcometext();
		GetInput();
		CalculateSalary();
		CalculateTex();
		SalaryTobePaid();
		DisplayOutPut();
		
		
	}

}


