package Entities;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Projects implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private LocalTime duration;
private String projectManager;
@OneToOne(mappedBy = "Projects",cascade = CascadeType.ALL)
@JoinColumn(name="client_id")
private Client client;
@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
private List<Employee> employees;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalTime getDuration() {
	return duration;
}
public void setDuration(LocalTime duration) {
	this.duration = duration;
}
public String getProjectManager() {
	return projectManager;
}
public void setProjectManager(String projectManager) {
	this.projectManager = projectManager;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}


}
