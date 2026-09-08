package com.bookmate.controller;


import java.util.Scanner;

import com.bookmate.service.ReservationService;

public class ReservationController {

    private ReservationService reservationService;

    private Scanner scanner = new Scanner(System.in);

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    public void start() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("     RESERVATION MANAGEMENT");
            System.out.println("================================");

            System.out.println("1. Reserve Book");
            System.out.println("2. Get Reservation By ID");
            System.out.println("3. Get All Reservations");
            System.out.println("4. Get Member Reservations");
            System.out.println("5. Get Book Reservations");
            System.out.println("6. Cancel Reservation");
            System.out.println("7. Complete Reservation");
            System.out.println("8. Check Book Reserved");
            System.out.println("9. Back");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    reserveBook();
                    break;

                case 2:
                    getReservationById();
                    break;

                case 3:
                    getAllReservations();
                    break;

                case 4:
                    getMemberReservations();
                    break;

                case 5:
                    getBookReservations();
                    break;

                case 6:
                    cancelReservation();
                    break;

                case 7:
                    completeReservation();
                    break;

                case 8:
                    isBookReserved();
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


    // 1. Reserve Book
    private void reserveBook() {

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();

        System.out.print("Enter Book ID: ");
        String bookId = scanner.nextLine();

        // Call proper method from Service
    }


    // 2. Get Reservation By ID
    private void getReservationById() {

        System.out.print("Enter Reservation ID: ");
        String reservationId = scanner.nextLine();

        // Call proper method from Service
    }


    // 3. Get All Reservations
    private void getAllReservations() {

        // Call proper method from Service
    }


    // 4. Get Member Reservations
    private void getMemberReservations() {

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();

        // Call proper method from Service
    }


    // 5. Get Book Reservations
    private void getBookReservations() {

        System.out.print("Enter Book ID: ");
        String bookId = scanner.nextLine();

        // Call proper method from Service
    }


    // 6. Cancel Reservation
    private void cancelReservation() {

        System.out.print("Enter Reservation ID: ");
        String reservationId = scanner.nextLine();

        // Call proper method from Service
    }


    // 7. Complete Reservation
    private void completeReservation() {

        System.out.print("Enter Reservation ID: ");
        String reservationId = scanner.nextLine();

        // Call proper method from Service
    }


    // 8. Check Book Reserved
    private void isBookReserved() {

        System.out.print("Enter Book ID: ");
        String bookId = scanner.nextLine();

        // Call proper method from Service
    }
}