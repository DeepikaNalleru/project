package Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entities.Client;
import Entities.Dept;
import Entities.Employee;
import Entities.Projects;
import Entities.company;

public class DataInsertion {
public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
  company company = new company();
  company.setCompany_name("TechCorp");
  company.setCompany_location("New York");

  Client client = new Client();
  client.setName("ABC Corp");
  client.setLocation("San Francisco");
  client.setPhone(1234567890l);
  
  Dept dept = new Dept();
  dept.setDeptno(101);
  dept.setLocation("New York");

  Employee employee1 = new Employee();
  employee1.setE_name("Deepika");
  employee1.setDept(dept);

  Employee employee2 = new Employee();
  employee2.setE_name("Jane Smith");
  employee2.setDept(dept);

  Projects project = new Projects();
  project.setName("Project A");
  project.setDuration(LocalTime.of(10, 0)); 
  project.setProjectManager("Alice Johnson");
  project.setClient(client); 
 
  company.setEmployees(Arrays.asList(employee1,employee2));

      et.begin();
      em.persist(dept);
      em.persist(project);
      em.persist(client);
      em.persist(company);  
      et.commit();
    }


}

