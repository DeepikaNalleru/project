package Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Dept implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int deptno;
private String location;
@OneToOne(mappedBy = "Dept")
@JoinColumn(name="e_id")
private Employee employee;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}

}
