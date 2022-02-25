package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	@Id
	@GeneratedValue
	@Column(name = "departmentId", nullable = false)
	private int departmentId;

	@Column(name = "deptName", length = 30, nullable = false)
	private String deptName;
}
