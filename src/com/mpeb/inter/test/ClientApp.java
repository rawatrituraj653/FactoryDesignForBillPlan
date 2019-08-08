package com.mpeb.inter.test;

import java.util.Scanner;

import com.mpeb.inter.BillPlan;
import com.mpeb.inter.factory.BillPlanFactory;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		try(Scanner scan=new Scanner(System.in)){
			System.out.println("Enter your plan Type Number");
			System.out.println("1.DomesticPlan");
			System.out.println("2.CommercialPlan");
			System.out.println("3.IndustrialPlan");
			int choose=scan.nextInt();
			if(choose<=3) {
			BillPlan billPlan  =BillPlanFactory.getBillPlan(choose);
			if(billPlan!=null) {
			System.out.println("Enter your Number of Units");	
			int units=scan.nextInt();
			Double  billAmt=billPlan.getBill(units);
			System.out.println("Your Bill Amount Is:: "+billAmt);
			
				}
		
			else {
				System.err.println("Internal server Error try Again");
			}
		}
			else {
				System.err.println("Invalid Plan Type");
			}	
		}
		
		
		
	}
}
