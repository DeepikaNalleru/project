package Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Client implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int client_id;
private String name;
private String location;
private long phone;
@OneToOne(mappedBy = "Client")
private Projects projects;

public int getClient_id() {
	return client_id;
}
public void setClient_id(int client_id) {
	this.client_id = client_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public Projects getProjects() {
	return projects;
}
public void setProjects(Projects projects) {
	this.projects = projects;
}

}
