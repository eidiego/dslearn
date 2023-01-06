package com.devsuperior.dslearnbds.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tb_task")
public class Task extends Lesson{
	private static final long serialVersionUID = 1L;

	private String description;
	private Integer questioncount;
	private Integer approvalCount;
	private Double weight;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dueDate;

	public Task() {
	}

	public Task(Long id, String title, Integer position, Section section, String description, Integer questioncount,
			Integer approvalCount, Double weight, Instant dueDate) {
		super(id, title, position, section);
		this.description = description;
		this.questioncount = questioncount;
		this.approvalCount = approvalCount;
		this.weight = weight;
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestioncount() {
		return questioncount;
	}

	public void setQuestioncount(Integer questioncount) {
		this.questioncount = questioncount;
	}

	public Integer getApprovalCount() {
		return approvalCount;
	}

	public void setApprovalCount(Integer approvalCount) {
		this.approvalCount = approvalCount;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Instant getDueDate() {
		return dueDate;
	}

	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
}
