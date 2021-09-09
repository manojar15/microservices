package com.fisglobal.training.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Certificates;
import com.fisglobal.training.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService{
	@Autowired
	private CertificateRepository certificateRepository;
	
	@Override
	public boolean saveCertificates(Certificates certificates) {
		// TODO Auto-generated method stub
		certificateRepository.save(certificates);
		return true;
		
	}

	@Override
	public boolean updateCertificates(Certificates certificates) {
		certificateRepository.save(certificates);
		return true;
	}

	@Override
	public boolean deleteCertificate(Integer id) {
		certificateRepository.deleteById(id);
		return true;
	}

	@Override
	public Certificates getById(Integer id) {
		return certificateRepository.getById(id);
		
	}

	@Override
	public List<Certificates> findAll() {
		return certificateRepository.findAll();

	}

}
