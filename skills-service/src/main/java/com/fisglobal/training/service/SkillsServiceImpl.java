package com.fisglobal.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Skills;
import com.fisglobal.training.repository.SkillsRepository;

@Service
public class SkillsServiceImpl implements SkillsService{
	
	@Autowired
	private SkillsRepository skillsRepository;
	
	@Override
	public boolean saveSkills(Skills skills) {
		skillsRepository.save(skills);
		return true;
	}

	@Override
	public boolean updateSkill(Skills skills) {
		skillsRepository.save(skills);
		return true;
	}

	@Override
	public boolean deleteSkills(Integer id) {
		skillsRepository.deleteById(id);
		return true;
	}

	@Override
	public Skills getById(Integer id) {
		return skillsRepository.getById(id);
	}

	@Override
	public List<Skills> findAll() {
		return skillsRepository.findAll();
	}

}
