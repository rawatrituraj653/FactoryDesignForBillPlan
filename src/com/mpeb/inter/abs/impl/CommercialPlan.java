package com.mpeb.inter.abs.impl;

import com.mpeb.inter.abs.BillPlanAbs;

public class CommercialPlan extends BillPlanAbs{

	public CommercialPlan() {
		System.out.println("Welcome to Commercial Plan");
	}
	
	@Override
	public int getRates() {
		return 8;
	}
}
