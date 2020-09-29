package com.custadd.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.custadd.entity.CustomerEntity;

@Repository
@Transactional
public class CustDaoImpl implements CustDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public CustomerEntity getCustForLogin(int id) {

		Query qry=em.createQuery("from CustomerEntity where id=:id");
		qry.setParameter("id", id);
		//qry.setParameter("psw", psw);
		
		CustomerEntity customerEntity=(CustomerEntity) qry.getSingleResult();
		
		return customerEntity;
	}

}
