package java_prectise;
import java.util.Scanner;

public class Employeessalarycalculatorv4 {

	static String ename;
	static double thour;
	static double hrate;
	static double tsalary;
	static double tax;
	static double spaid;

	public static void Welcometext() {
		System.out.print("\nWelcome To Employees Salary Calculator\n");
		System.out.print("*********Version4.0*******\n");
		System.out.print("Please follow the promt\n");
	}

	public static Scanner Takeinput() {
		return new Scanner(System.in);

	}

	public static void Getinput() {
		Scanner myscanner = Takeinput();
		System.out.println("\nEnter Employee Name:");
		ename = myscanner.nextLine();
		int trycount = 1;
		char isinputcorrect = 'N';
		do {
			try {
				System.out.println("\nEnter Total Hour:");
				thour = myscanner.nextDouble();
				if (thour >= 0 && thour <= 100) {
					isinputcorrect = 'Y';

				} else {
					System.out.println("Wrong input enter total hour between o to 100... ");
					System.out.println("You Entered : " + thour);
					System.out.println("Please  enter valid input..");
					isinputcorrect = 'N';
					trycount++;
					// System.exit(0);
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Please enter  valid input..You entered letters instead of numbers..");
				isinputcorrect = 'N';
				trycount++;
				// System.exit(0);
			}
			if (trycount > 5) {
				System.out.println("Please run the program again and enter valid input..");
				System.exit(0);

			}
		} while (isinputcorrect == 'N');
		do {
			try {
				System.out.println("Enter Hourly Rate:");
				hrate = myscanner.nextDouble();
				if (hrate >= 15 && hrate <= 80) {
					isinputcorrect = 'Y';

				} else {
					System.out.println("Wrong input enter  hourly rate between 15 to 80... ");
					System.out.println("You Entered : " + hrate);
					System.out.println("Please  enter valid input..");
					isinputcorrect = 'N';
					trycount++;
					// System.exit(0);

				}

			} catch (Exception e) {
				// TODO: handle exception

				System.out.println("Please  enter valid input..You entered letters instead of numbers..");
				isinputcorrect = 'N';
				trycount++;
				// System.exit(0);
			}
			if (trycount > 5) {
				System.out.println("Please run the program again and enter valid input..");

				System.exit(0);

			}
		} while (isinputcorrect == 'N');

	}

	public static void Calculatetotalsalary() {
		tsalary = thour * hrate;
		// returntsalary;
	}

	public static void Calculatetax() {
		if (tsalary < 1500) {
			tax = tsalary * .15;
		} else if (tsalary >= 1500 && tsalary < 3000) {
			tax = tsalary * .20;
		} else if (tsalary >= 3000 && tsalary < 4500) {
			tax = tsalary * .30;
		} else if (tsalary >= 4500 && tsalary < 6000) {
			tax = tsalary * .40;
		} else if (tsalary >= 6000) {
			tax = tsalary * .50;
		}

	}

	public static void Calculatesalarytobepaid() {
		spaid = tsalary - tax;
		// return apaid;
		// double result=Calculatetotalsalary()-Calculatetax();
		// return result;

	}

	public static void Displayoutput() {
		// System.out.println("Total Salary :"+double result;
		// double result=Calculatetotalsalary();
		System.out.println("Employee Name             :" + ename);
		System.out.println("Employee Total Hour Worked:" + thour);
		System.out.println("Employee Houerly Payrate  :" + hrate);
		System.out.println("************************************");
		System.out.println("TOTAL SALARY      :" + tsalary);
		System.out.println("Tax               :" + tax);
		System.out.println("Salary To Be Paid :" + spaid);
	}

	public static boolean Doyouwanttocontinue() {
		Scanner choice = Takeinput();
		String doyouwanttocontinue;
		System.out.println("\nDo you want to Continue :only Yes/No is acceptable");
		doyouwanttocontinue = choice.nextLine();
		doyouwanttocontinue = doyouwanttocontinue.toLowerCase();
		if (doyouwanttocontinue.equals("yes")) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Welcometext();
		for (int i = 1; i <= 5; i++) {
			System.out.println("processing calculation for employee:"+i);
			Getinput();
			Calculatetotalsalary();
			Calculatetax();
			Calculatesalarytobepaid();
			Displayoutput();
			if (!Doyouwanttocontinue())

				break;

		}

	}

}


