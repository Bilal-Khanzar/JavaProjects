package project1;

import java.util.Scanner;

public class Project {
	static int total_coust(int total_spend_time) {
		int airlinese = 50;
		int  munite_coust = 2;
		
		return (total_spend_time*munite_coust + airlinese);
		
	}
	static int total_coust(int  total_spend_time, int time_spend_otopark) {
		int airlinese = 50;
		int  munite_coust = 2;
		int park_coust = 3;
		return(total_spend_time*munite_coust) +( time_spend_otopark*park_coust +airlinese);
	}

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		String message = "wlcome to Airport \n"
				+ "Airport Entrance fee is  50 TL\n"
				+ "Airport entrance gate A without a car Airport entrace gate B with a car \n"
				+ " every munite that you wasted   in Airpot fee is 2 tl\n"
				+ " you pay this fee when you exit. ";
		System.out.println(message);
		System.out.println("");
		System.out.println("");
		
		System.out.println("please choice the gate ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine().toUpperCase();
		while(true) {
			if(choice.equals("A")) {
				String c1 = "welcome to AIRPOT the  exit door\n"
						+ "please entrace that you waste time in the  Airport ";
				System.out.println(c1);
				int toplam_gecirilen_dakika = scanner.nextInt();
				System.out.println("toplam maaliyet hesapla " + total_coust(toplam_gecirilen_dakika));
				
				System.out.println("your payment is being processed ...");
				Thread.sleep(2000); 
				
				System.out.println("your pyment process done well... have a good day  ");
				
				return;
				
			}
			else if (choice.equals("B")) {
				String c2 = "Welcome to Airport Exit gate "
						+ "please entrace that you waste in the  Airport ";
				System.out.println(c2);
				int toplam_gecirilen_dakika = scanner.nextInt();
				
				System.out.println("please entrance the time that your car stay in otopark ");
				
				int otopatka_harcana_dakika = scanner.nextInt();
				System.out.println("total pymentr fee is " + total_coust(toplam_gecirilen_dakika, otopatka_harcana_dakika));
				
				System.out.println("your payment is being process ...");
				Thread.sleep(2000);
				System.out.println("your payment process done well ");
				return;
				
			}
			else {
				System.out.println("your choice is wrong please try again . ");
				
				break;
				
			}
			
			
		}
		

	}

}
