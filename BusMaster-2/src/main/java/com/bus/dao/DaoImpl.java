package com.bus.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bus.entity.BusDetailEntity;
import com.bus.entity.BusScheduleEntity;

@Repository
@Transactional
public class DaoImpl implements IDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<BusScheduleEntity> getBusDetails(String src, String dest, LocalDate date) {

		Query qry=em.createQuery("from BusScheduleEntity bs inner join fetch bs.busDetail c where c.source=:src and c.dest=:dest and bs.deptDate=:date");
		//Query qry=em.createNativeQuery("select bus_name,busdetails.bus_id,dest,source,busscheduledetails.avail_seats,busscheduledetails.dept_date,busscheduledetails.fare from busdetails inner join busscheduledetails on busdetails.bus_id=busscheduledetails.bus_id where busdetails.dest=:dest and busdetails.source=:src and busscheduledetails.dept_date=:dt");
		qry.setParameter("src", src);
		qry.setParameter("dest", dest);
		qry.setParameter("date",date );
//		qry.setParameter("dest", dest);
//		qry.setParameter("src", src);
//		qry.setParameter("dt", date);
		List<BusScheduleEntity> lst=qry.getResultList();
		return lst;
	}

}
