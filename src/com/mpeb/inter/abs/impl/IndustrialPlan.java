package com.mpeb.inter.abs.impl;

import com.mpeb.inter.abs.BillPlanAbs;

public class IndustrialPlan extends BillPlanAbs{

	public  IndustrialPlan() {
		System.out.println("Welcome  to IndustrialPlan");
	}
	
	@Override
	public int getRates() {

		return 12;
	}
	
}
