package com.pck.service;

import com.pck.dao.IPatientDAO;
import com.pck.dao.PatientDAOImpl;
import com.pck.dto.PatientDTO;
import com.pck.eo.Patient_DetailsEO;

public class PatientServiceImpl implements IPatientService {
    private IPatientDAO dao;
    private static final Float BILL_PER_DAY=1000F;
    
    PatientServiceImpl(IPatientDAO dao)
    {
    	this.dao=dao;
    }
	
	@Override
	public String calculateNetBill(PatientDTO dto) throws Exception {
		// TODO Auto-generated method stub
		float billAmt=dto.getDays_of_hospitalized() * BILL_PER_DAY;
		int discount = (billAmt > 100000  && billAmt < 200000) ? 10 : 
			           (billAmt > 200000  && billAmt < 300000) ? 20 :
			           (billAmt > 300000) ? 30 : 0; 
		float netBill=billAmt - (billAmt * discount/100);
        float discountAmt=billAmt-netBill;
		
		Patient_DetailsEO eo= new Patient_DetailsEO();
		eo.setPatient_name(dto.getPatient_name());
		eo.setPatient_addrs(dto.getPatient_addrs());
		eo.setPatient_mob_no(dto.getPatient_mob_no());
		eo.setDays_of_hospitalized(dto.getDays_of_hospitalized());
		eo.setBill_per_day(BILL_PER_DAY);
		eo.setTotal_bill_amt(billAmt);
		eo.setDiscount_amt(discountAmt);
        eo.setNet_bill_amt(netBill);
        int count=dao.insert(eo);
		System.out.println("------------------------>"+count);
		return count==1 ? "Successfully Inserted Patient record with net bill amount:  "+netBill :"Fail............" ;
	}

}
