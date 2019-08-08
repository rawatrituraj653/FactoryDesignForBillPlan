package com.mpeb.inter.abs;

import com.mpeb.inter.BillPlan;

public abstract class BillPlanAbs implements BillPlan{

	public abstract int getRates() ;
	@Override
	public Double getBill(int units) {
	
		return (double) (units*this.getRates()); 
	}
}
