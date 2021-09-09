package com.fisglobal.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.fisglobal.training.service.SkillsService;
import com.fisglobal.training.model.Skills;

@RestController
@RequestMapping("/api")
public class SkillsRestController {

	
	@Autowired
	private SkillsService skillsService;
	
	@GetMapping("/skills{id}")
	public Skills getSkillById(@PathVariable("id") Integer id)
	{
		return skillsService.getById(id);
	}
	
	@GetMapping("/skills")
	public List<Skills> getAllSkills()
	{
		return skillsService.findAll();
	}
	
	@PostMapping("/skills")
	public Skills addSkills(@RequestBody Skills skills)
	{
		skillsService.saveSkills(skills);
		return skills;
	}
	
	@PutMapping("/skills")
	public Skills updateSkills(@RequestBody Skills skills)
	{
		skillsService.updateSkill(skills);
		return skills;
	}
	
	@DeleteMapping("/skills")
	public String deleteSkills(@PathVariable("id") Integer id)
	{
		skillsService.deleteSkills(id);
		return "id : "+id+"deleted";
	}
}
