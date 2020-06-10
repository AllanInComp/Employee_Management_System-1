package com.tyy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.tyy.services.validators.EMRConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="manager_employee_relation")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EMRConstraint
public class ManagerEmployeeRelation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name="managerid")
	private int managerid;
	
	@NotEmpty
	@Column(name="employeeid")
	private int employeeid;
}
