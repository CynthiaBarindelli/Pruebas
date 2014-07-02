package bd;
import bd.Persona;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProj");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Persona persona = new Persona();
		persona.setCi(333);
		persona.setNombre("micaela");
		persona.setApellido("guitierrez");
		System.out.println(persona.getApellido());
		em.persist(persona);
		em.flush();
		
		Persona persona1=em.find(Persona.class,111);
		//System.out.println(persona1);
		em.remove(persona1);
		
		
		//em.persist(persona1);
		//em.flush();
		
		//int ci=1;;
		Persona per=em.find(Persona.class,222);
		if(per!=null)
		{
			System.out.println(per.getApellido());
			
		}
		
		//em.getTransaction().commit();

	}
}
