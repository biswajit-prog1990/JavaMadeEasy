package com.training.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = emf.createEntityManager();
        Alien a = em.find(Alien.class, 1001);
        System.out.println(a);
        Alien a1 = new Alien();
        a1.setAid(1005);
        a1.setAage(39);
        a1.setAname("Kavish");
        if ( em.find(Alien.class, 1005) == null) {
        	em.getTransaction().begin();
            em.persist(a1);
            em.getTransaction().commit();            
        }        
        emf.close();
    }
}
