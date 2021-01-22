import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CompanyMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU"); //EntityManager to perform operations on object
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();  
		
		Department dept = new Department();
		dept.setDept_name("Sales");
        em.persist(dept);
        
        Employee emp1 = new Employee("Mansi","Sawant");
		Employee emp2 = new Employee("Preshita","Sawant");
		
		emp1.setDepartment(dept);
		emp2.setDepartment(dept);
		
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		em.close();
	}

}
