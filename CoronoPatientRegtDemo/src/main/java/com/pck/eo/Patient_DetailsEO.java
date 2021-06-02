package com.pck.eo;

public class Patient_DetailsEO
{
	private String patient_name;
	private String patient_addrs;
	private String patient_mob_no;
	private Integer days_of_hospitalized;
	private Float bill_per_day;
	private Float total_bill_amt;
	private Float discount_amt;
	private Float net_bill_amt;
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_addrs() {
		return patient_addrs;
	}
	public void setPatient_addrs(String patient_addrs) {
		this.patient_addrs = patient_addrs;
	}
	public String getPatient_mob_no() {
		return patient_mob_no;
	}
	public void setPatient_mob_no(String patient_mob_no) {
		this.patient_mob_no = patient_mob_no;
	}
	public Integer getDays_of_hospitalized() {
		return days_of_hospitalized;
	}
	public void setDays_of_hospitalized(Integer days_of_hospitalized) {
		this.days_of_hospitalized = days_of_hospitalized;
	}
	public Float getBill_per_day() {
		return bill_per_day;
	}
	public void setBill_per_day(Float bill_per_day) {
		this.bill_per_day = bill_per_day;
	}
	public Float getTotal_bill_amt() {
		return total_bill_amt;
	}
	public void setTotal_bill_amt(Float total_bill_amt) {
		this.total_bill_amt = total_bill_amt;
	}
	public Float getDiscount_amt() {
		return discount_amt;
	}
	public void setDiscount_amt(Float discount_amt) {
		this.discount_amt = discount_amt;
	}
	public Float getNet_bill_amt() {
		return net_bill_amt;
	}
	public void setNet_bill_amt(Float net_bill_amt) {
		this.net_bill_amt = net_bill_amt;
	}
	@Override
	public String toString() {
		return "Patient_Details [patient_name=" + patient_name + ", patient_addrs=" + patient_addrs
				+ ", patient_mob_no=" + patient_mob_no + ", days_of_hospitalized=" + days_of_hospitalized
				+ ", bill_per_day=" + bill_per_day + ", total_bill_amt=" + total_bill_amt + ", discount_amt="
				+ discount_amt + ", net_bill_amt=" + net_bill_amt + "]";
	}
	
	

}
