package com.bookmate.controller;


import java.util.Scanner;

public class LibraryController {

    private MemberController memberController;
    private BookController bookController;
    private IssueController issueController;
    private ReturnController returnController;
    private ReservationController reservationController;
    private FineController fineController;

    private Scanner scanner = new Scanner(System.in);


    public LibraryController(
            MemberController memberController,
            BookController bookController,
            IssueController issueController,
            ReturnController returnController,
            ReservationController reservationController,
            FineController fineController) {

        this.memberController = memberController;
        this.bookController = bookController;
        this.issueController = issueController;
        this.returnController = returnController;
        this.reservationController = reservationController;
        this.fineController = fineController;
    }


    public void start() {

        while (true) {

            System.out.println();
            System.out.println("====================================");
            System.out.println("     LIBRARY MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Member Management");
            System.out.println("2. Book Management");
            System.out.println("3. Issue Management");
            System.out.println("4. Return Management");
            System.out.println("5. Reservation Management");
            System.out.println("6. Fine Management");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    memberController.start();
                    break;

                case 2:
                    bookController.start();
                    break;

                case 3:
                    issueController.start();
                    break;

                case 4:
                    returnController.start();
                    break;

                case 5:
                    reservationController.start();
                    break;

                case 6:
                    fineController.start();
                    break;

                case 7:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}