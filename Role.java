package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class Role {
	@Id
	@GeneratedValue
	@Column(name = "roleId", nullable = false)
	private int roleId;

	@Column(name = "title", length = 30, nullable = false)
	private String title;
}
