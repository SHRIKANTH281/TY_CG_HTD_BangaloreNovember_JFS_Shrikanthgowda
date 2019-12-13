package com.capgemini.jpawithhibernate.onetoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.manytomany.TrainingInfo;
import com.capgemini.jpawithhibernate.manytoone.EmployeeExperience;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfo {
	@Id
	@Column
	private int eid;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Exclude
	@OneToOne(cascade =CascadeType.ALL, mappedBy= "employee")
	private EmployeeOtherInfo other;
	
	@Exclude
	@OneToMany(cascade=CascadeType.ALL, mappedBy="employee")
	private List<EmployeeExperience> exp;
	
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="eList")
	private List<TrainingInfo> train;

}
