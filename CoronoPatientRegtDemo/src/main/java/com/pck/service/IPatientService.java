package com.pck.service;

import com.pck.dto.PatientDTO;

public interface IPatientService {

	 String calculateNetBill(PatientDTO dto) throws Exception;
}
