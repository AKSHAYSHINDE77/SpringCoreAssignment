package com.springcore.Que3;

public class Emi {
	
	double principal=100000, rate, time_period=1, emi, time_year;

	//Getters and settres called
	
	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTime_period() {
		return time_period;
	}

	public void setTime_period(double time_period) {
		this.time_period = time_period;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}
	
	//Default Constructor called
	public Emi() {
		super();
	}

	public void CalculateEmi()
	{
		rate=rate/(12*100);
		
		time_year=time_year*12;
		emi=(principal*rate*Math.pow(1+rate, time_year))/(Math.pow(1+rate, time_year)-1);
		System.out.println("Monthly EMI is:"+emi);
		System.out.println("Total no.of EMI Ammount is :"+emi*12);
		System.out.println("Total EMI :"+time_year);
	}

	

}
