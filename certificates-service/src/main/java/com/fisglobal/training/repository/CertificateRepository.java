package com.fisglobal.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Certificates;

@Repository
public interface CertificateRepository extends JpaRepository<Certificates, Integer>{

}
