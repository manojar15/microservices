package com.fisglobal.training.Service;

import com.fisglobal.training.model.Certificates;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CertificateService {
	public boolean saveCertificates(Certificates certificates);
	public boolean updateCertificates(Certificates certificates);
	public boolean deleteCertificate(Integer id);
	public Certificates getById(Integer id);
	public List<Certificates> findAll();
}
