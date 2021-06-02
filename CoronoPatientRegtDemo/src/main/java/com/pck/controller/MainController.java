package com.pck.controller;

import com.pck.dto.PatientDTO;
import com.pck.service.IPatientService;
import com.pck.vo.PatientVO;


public class MainController {
	private IPatientService service;
	MainController(IPatientService service)
	{
		this.service=service;
	}
    
	public String processPatient(PatientVO vo) throws Exception
	{
		PatientDTO dto= new PatientDTO();
		dto.setPatient_name(vo.getPatient_name());
		dto.setPatient_addrs(vo.getPatient_addrs());
		dto.setPatient_mob_no(vo.getPatient_mob_no());
		dto.setDays_of_hospitalized(Integer.parseInt(vo.getDays_of_hospitalized()));
		String result=service.calculateNetBill(dto);
		return result;
	}
}
