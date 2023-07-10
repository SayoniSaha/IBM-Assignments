package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employee")
@Entity

public class Employee {
	@Id
	@Column(name = "emp_id")
	private String empid;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "salary")
	private String salary;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Department dept;
	
	public Employee(String empName, String salary, Department dept) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}
}
