import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU"); //EntityManager to perform operations on object
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();               
		
		Student student = new Student();
		student.setName("Mansi");
       
        Address address = new Address();
        address.setStreetName("Panvel");
        
        student.setAddress(address);
        
        em.persist(student);
        em.getTransaction().commit();        
        em.close();
        factory.close();
	}

}
