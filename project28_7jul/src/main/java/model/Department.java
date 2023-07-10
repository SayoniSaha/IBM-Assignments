package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "department")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Department {
	@Id
	@Column(name = "dept_id")
	private int dept_id;
	@Column(name = "department")
	private String department;
	@Column(name = "location")
	private String location;
}
