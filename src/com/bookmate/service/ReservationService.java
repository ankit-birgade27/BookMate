package com.bookmate.service;



import java.util.List;

import com.bookmate.model.Reservation;

public interface ReservationService {

    Reservation reserveBook(String memberId, String bookId);

    Reservation getReservationById(String reservationId);

    List<Reservation> getAllReservations();

    List<Reservation> getMemberReservations(String memberId);

    List<Reservation> getBookReservations(String bookId);

    void cancelReservation(String reservationId);

    void completeReservation(String reservationId);

    boolean isBookReserved(String bookId);
}
