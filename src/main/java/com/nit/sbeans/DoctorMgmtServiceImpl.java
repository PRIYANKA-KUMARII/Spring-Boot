package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService {
@Autowired
private IDoctorRepo doctorRepo;


	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doc Id(before save::"+doctor.getDocId());
		 Doctor doc=doctorRepo.save(doctor);
		 return "Doctor obj is saved with id value:"+doc.getDocId();
		
	}
}
