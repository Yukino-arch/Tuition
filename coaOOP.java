package hellowork;

import java.util.Scanner;
public class coaOOP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String user;
		
			
		System.out.println("welcome to philcst");	
		
		while(true) {
		System.out.println(""" 
				
				\nMain Menu
					(1) Cash
					(2) Two-Installment
					(3) Three-Installment
				""");
		
		System.out.print("Enter Tuition Fee: ");
		int TF = scan.nextInt();
		System.out.println(" ");
		
		System.out.println("Press 1 for Cash");
		System.out.println("Press 2 for Two-Installment");
		System.out.println("Press 3 for Three-Installment");
		System.out.println(" ");
		
		System.out.print("Enter Mode of payments: ");
		int payment = scan.nextInt();
		scan.nextLine();
		
		if(payment == 1) {
			double cash = TF * 0.10;
			double TFcash = TF - cash;
			System.out.println("Your Tuition fee is " + TFcash );
		}
		else if(payment == 2) {
			double Two_installment = TF * 0.05;
			double TF_two_installment = TF - Two_installment;
			System.out.println("Your tuition fee per month in 2 months is " + TF_two_installment/2);
			System.out.println("Your total Tuition Fee is " + TF_two_installment);
		}
		else if(payment == 3) {
			double Three_installment = TF * 0.25 * 0.1;
			double TF_three_installment = TF + Three_installment;
			
			System.out.println("Your tuition fee per month in 3 months is " + TF_three_installment/3);
			System.out.println("The interest is " + Three_installment);
			System.out.println("Your total tuition fee is " + TF_three_installment);
			
				
		}
		System.out.println("\nDo you want to continue? ");
		String response = scan.nextLine();
		if(response.equalsIgnoreCase("yes")) {
			continue;
		}else {
			System.out.println("Hope you enjoy our system. Thank You!!");
			break;
		}
		}
		
		
		
	}

}
