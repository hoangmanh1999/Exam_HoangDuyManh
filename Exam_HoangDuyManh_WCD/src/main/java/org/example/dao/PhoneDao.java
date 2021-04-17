package org.example.dao;

import org.example.model.PhoneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
public class PhoneDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("persistence");
EntityManager em=emf.createEntityManager();

public void insertPhone(PhoneEntity p){
em=emf.createEntityManager();
em.getTransaction().begin();
em.persist(p);
em.getTransaction().commit();
em.close();
}

public List<PhoneEntity> getAll()
{
em=emf.createEntityManager();
em.getTransaction().begin();
List<PhoneEntity> list=em.createQuery("select p from PhoneEntity p", PhoneEntity.class).getResultList();
em.getTransaction().commit();
em.close();
return list;
}


}
