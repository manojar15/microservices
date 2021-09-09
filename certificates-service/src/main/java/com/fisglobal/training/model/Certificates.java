package com.fisglobal.training.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Certificates {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Integer id;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LocalDate getDateOfIssue() {
	return dateOfIssue;
}
public void setDateOfIssue(LocalDate dateOfIssue) {
	this.dateOfIssue = dateOfIssue;
}
public LocalDate getDateOfExpiry() {
	return dateOfExpiry;
}
public void setDateOfExpiry(LocalDate dateOfExpiry) {
	this.dateOfExpiry = dateOfExpiry;
}
public Integer getPassingMarks() {
	return passingMarks;
}
public void setPassingMarks(Integer passingMarks) {
	this.passingMarks = passingMarks;
}
public Integer getMaxScore() {
	return maxScore;
}
public void setMaxScore(Integer maxScore) {
	this.maxScore = maxScore;
}
public Integer getScorePerecentege() {
	return scorePerecentege;
}
public void setScorePerecentege(Integer scorePerecentege) {
	this.scorePerecentege = scorePerecentege;
}
private String name;
private String description;
private LocalDate dateOfIssue;
private LocalDate dateOfExpiry;
private Integer passingMarks;
private Integer maxScore;
private Integer scorePerecentege;

}
