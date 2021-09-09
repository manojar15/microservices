package com.fisglobal.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.training.Service.CertificateService;
import com.fisglobal.training.model.Certificates;


@RestController
@RequestMapping("/api")
public class CertificatesRestController {

	@Autowired
	private CertificateService certificateService;
	
	@GetMapping("certificates{id}")
	public Certificates getCertificateById(@PathVariable("id") Integer id)
	{
		return certificateService.getById(id);
	}
	

@GetMapping("/certificates")
public List<Certificates> getAllCertificates()
{
	return certificateService.findAll();
}

@PostMapping("/certificates")
public Certificates addCertificates(@RequestBody Certificates certificates)
{
	certificateService.saveCertificates(certificates);
	return certificates;
}

@PutMapping("/certificates")
public Certificates updateCertificates(@RequestBody Certificates certificates)
{
	certificateService.updateCertificates(certificates);
	return certificates;
}

@DeleteMapping("/certificates")
public String updateCertificate(@PathVariable("id") Integer id)
{
	certificateService.deleteCertificate(id);
	return "id : "+id+ " deleted";
}
}
