package com.mpeb.inter.factory;

import com.mpeb.inter.BillPlan;

public class BillPlanFactory {

	public static BillPlan getBillPlan(int choice) throws Exception{	
		String cls=getPlanName(choice);
		if(cls!=null) {
		Object obj=Class.forName(cls).newInstance();
		if(obj instanceof BillPlan) {
			BillPlan bp=(BillPlan) obj;	
			return bp; 
			}
		}
		return null;
	}
	private static String getPlanName(int choice) {
		String cls=null;
		
		switch(choice) {
		case 1: cls="com.mpeb.inter.abs.impl.DomesticPlan";break;
		case 2: cls="com.mpeb.inter.abs.impl.CommercialPlan";break;
		case 3: cls="com.mpeb.inter.abs.impl.IndustrialPlan";break;
		default :break;
		}
		return cls;
	}
}
