package com.capgemini.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU"); //EntityManager to perform operations on object
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();               
		
		Message message = new Message();
        message.setText("Hello");
        em.persist(message);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
        Message message1 = new Message();
        message1.setText("World");
        em.persist(message1);
        em.getTransaction().commit();
        em.close();
        factory.close();
	}

}
