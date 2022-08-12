package com.demo;

import java.util.Scanner;

public class LedgerCo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		  loan();
       
        
                 
	}
	public static void loan() {
		System.out.println("Enter LOAN BANK_NAME  and BORROWER_NAME and PRINCIPAL and NO_OF_YEARS and RATE_OF_INTEREST ");
		String s1 = sc.nextLine();
		String[] loan = s1.split(" ");
		String Bank_Name = loan[0];
		String Borrower_Name = loan[1];
		double principal = Double.parseDouble(loan[2]);
		double time = Double.parseDouble(loan[3]);
		double rate = Double.parseDouble(loan[4]);
		double si =  (principal*time*rate)/100;
        //System.out.print(" si is= "+si+"\n");
		double TotalAmount = si+principal; 
		//System.out.print(" si is= "+TotalAmount+"\n");
		double emi = TotalAmount / (time*12);
		//System.out.println(emi);
		
		 System.out.println("Enter bank_name borrower_name amout emi");
	     String s2 = sc.nextLine();
	     String[] payment = s2.split(" ");
	     String pBank_Name = payment[0];
		 String pBorrower_Name = payment[1];
	     double pamount = Double.parseDouble(payment[2]);
		 double pemi = Double.parseDouble(payment[3]);
		 if(pBank_Name.equals(Bank_Name) && pBorrower_Name.equals(Borrower_Name)) {
			 double amount = principal - (pemi*emi);
			 System.out.println(amount);
			 double rem = amount - pamount;        
			 double emi2= (rem*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
		     System.out.print(" EMI is= "+emi+"\n");
			 System.out.println(pBank_Name+" "+pBorrower_Name+" "+rem+" "+emi2);
		 }else
		 {
			 
		 }
	}

}
