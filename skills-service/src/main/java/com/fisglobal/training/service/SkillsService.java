package com.fisglobal.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Skills;

@Service
public interface SkillsService {
	public boolean saveSkills(Skills skills);
	public boolean updateSkill(Skills skills);
	public boolean deleteSkills(Integer id);
	public Skills getById(Integer id);
	public List<Skills> findAll();
}
