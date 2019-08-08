package com.mpeb.inter.abs.impl;

import com.mpeb.inter.abs.BillPlanAbs;

public class DomesticPlan extends BillPlanAbs{

	
	public DomesticPlan() {
		System.out.println("Welcome to Domestic Plan");
	}
	
	@Override
	public int getRates() {	
		return 6;
	}
}
