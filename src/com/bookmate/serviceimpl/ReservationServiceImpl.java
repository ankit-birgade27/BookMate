package com.bookmate.serviceimpl;

import java.util.List;

import com.bookmate.dao.ReservationDao;
import com.bookmate.model.Reservation;
import com.bookmate.service.ReservationService;

public class ReservationServiceImpl  implements ReservationService{

	
	private ReservationDao reservationDao;
	public ReservationServiceImpl(ReservationDao reservationDao) {
	    this.reservationDao = reservationDao;
	}

	@Override
	public Reservation reserveBook(String memberId, String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation getReservationById(String reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getAllReservations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getMemberReservations(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getBookReservations(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelReservation(String reservationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completeReservation(String reservationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isBookReserved(String bookId) {
		// TODO Auto-generated method stub
		return false;
	}

}
