package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_otherinfo")
public class EmployeeOtherInfo {
	@Id
	@Column
	private int id;
	@Column(name="pan_card")
	private String pcard;
	@Column(name="f_name")
	private String fname;
	@Column(name="m_name")
	private String mname;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")

	private EmployeeInfo employee;

}
