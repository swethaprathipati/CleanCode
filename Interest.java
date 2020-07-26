
import java.io.*;
import java.util.*;

public class Interest {

	static {
		Scanner sc = new Scanner(System.in);
		
		System.out.format("%s", "Enter principle amount");
		double principal = sc.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double rate_of_interest = sc.nextDouble();
		System.out.format("%s", "Enter number of years");
		double time_period = sc.nextDouble();
		
		Compute com = new Compute(principal, rate_of_interest, time_period);
		
		System.out.format("%s","Select  1. Calculating Simple Interest  2. Calculating Compound Interest  3. Both  ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.format("%s",String.valueOf(com.CalSimpleInterest()));
			break;
		case 2:
			System.out.format("%s",String.valueOf(com.calCompoundInterest()));
			break;
		case 3:
		    System.out.format("%s\n",String.valueOf(com.CalSimpleInterest()));
		    System.out.format("%s",String.valueOf(com.calCompoundInterest()));
			break;

		}
		sc.close();
		System.exit(0);
	}

	public static void main(String[] args) {

	}
}

class Compute {
	double principal, rate_of_interest, time_period;
	
	Compute(double principal, double rate_of_interest, double time_period){
		this.principal = principal;
		this.rate_of_interest = rate_of_interest;
		this.time_period = time_period;
	}
	
	double calCompoundInterest() {
		return (principal * (Math.pow(1 + rate_of_interest / 100, time_period)));
	}

	double CalSimpleInterest() {
		return (principal * rate_of_interest * time_period) / 100;
	}

}
