package com.booking.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.booking.entity.BookingDetails;
import com.booking.entity.BusScheduleEntity;
import com.booking.entity.CustomerEntity;
import com.booking.entity.SubBookEntity;

@Repository
@Transactional
public class DaoImpl implements IDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<BookingDetails> bookDetails(int id) {

		Query qry = em.createQuery("from BookingDetails bd inner join fetch bd.customerEntity c where c.id=:id");
		// Query qry=em.createNativeQuery("select*from bookingdetails inner join
		// customerdetails on bookingdetails.cust_id=customerdetails.id where
		// customerdetails.id=:id");
		qry.setParameter("id", id);
		List<BookingDetails> lst = qry.getResultList();
		return lst;
	}

	@Override
	public String booking(int custid, int schid) {

		Query qry = em.createQuery("from CustomerEntity where id=:id");
		qry.setParameter("id", custid);
		CustomerEntity customerEntity = (CustomerEntity) qry.getSingleResult();

		Query qry1 = em.createQuery("from BusScheduleEntity where busSchId=:schid");
		// Query qry1=em.createNativeQuery("select*from busscheduledetails where
		// bus_sch_id=:schid;");
		qry1.setParameter("schid", schid);
		BusScheduleEntity bse = (BusScheduleEntity) qry1.getSingleResult();

		BookingDetails bd = new BookingDetails();
		bd.setBookdate(LocalDate.now());
		customerEntity.setId(custid);
		// customerEntity.setBookingDetails((List<BookingDetails>) bd);
		int wallet = (int) customerEntity.getCustWal();
		long fare = (long) bse.getFare();
		int farevalue = (int) fare;
		if (wallet > farevalue) {
			bd.setStatus("BOOKED");
			customerEntity.setCustWal(customerEntity.getCustWal() - bse.getFare());
			bse.setAvailSeats(bse.getAvailSeats() - 1);
			bd.setCustomerEntity(customerEntity);
			em.merge(customerEntity);
			em.merge(bse);
			em.persist(bd);
			return "booked";
		} else {
			bd.setStatus("CANCELLED");
			em.persist(bd);
			return "Cancelled";
		}
	}

	@Override
	public String subbooking(int custid,int schid, CustomerEntity customerEntity, int age, String name, String gender) {
		
		Query qry = em.createQuery("from BookingDetails bd inner join fetch bd.customerEntity c where c.id=:id order by bd.bookId desc");
		qry.setParameter("id", custid);
		qry.setFirstResult(0);
		qry.setMaxResults(1);
		BookingDetails bookingDetails = (BookingDetails) qry.getSingleResult();
		
		
		Query qry1 = em.createQuery("from BusScheduleEntity where busSchId=:schid");
		qry1.setParameter("schid", schid);
		BusScheduleEntity bse = (BusScheduleEntity) qry1.getSingleResult();
		
		SubBookEntity subbook = new SubBookEntity();
		int wallet=(int) customerEntity.getCustWal();
		long farevalue=bse.getFare();
		int fare=(int) farevalue;
		if(wallet>fare) {
			customerEntity.setCustWal(customerEntity.getCustWal()-fare);
		subbook.setCoName(name);
		subbook.setCoAge(age);
		subbook.setCoGender(gender);
		subbook.setBookingDetails(bookingDetails);
		bse.setAvailSeats(bse.getAvailSeats()-1);
		bookingDetails.setCustomerEntity(customerEntity);
		em.merge(customerEntity);
		em.merge(bse);
		em.persist(subbook);
		return "booked";
		}
		else
			return "cancelled";
	}

	@Override
	public List<SubBookEntity> viewSubbookdetails(int bookid) {

		Query qry=em.createQuery("from SubBookEntity sb inner join fetch sb.bookingDetails a where a.bookId=:bookid");
		qry.setParameter("bookid", bookid);
		List<SubBookEntity> lst=qry.getResultList();
		return lst;
	}

}
