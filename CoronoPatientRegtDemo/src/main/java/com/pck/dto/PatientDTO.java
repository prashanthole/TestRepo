package com.pck.dto;

public class PatientDTO 
{
	private String patient_name;
	private String patient_addrs;
	private String patient_mob_no;
	private Integer days_of_hospitalized;
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
	@Override
	public String toString() {
		return "PatientDTO [patient_name=" + patient_name + ", patient_addrs=" + patient_addrs + ", patient_mob_no="
				+ patient_mob_no + ", days_of_hospitalized=" + days_of_hospitalized + "]";
	}
	
	
}
