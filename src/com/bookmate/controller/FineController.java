package com.bookmate.controller;

import java.util.Scanner;

import com.bookmate.service.FineService;

public class FineController {

    private FineService fineService;

    private Scanner scanner = new Scanner(System.in);

    public FineController(FineService fineService) {
        this.fineService = fineService;
    }

    public void start() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("        FINE MANAGEMENT");
            System.out.println("================================");

            System.out.println("1. Calculate Fine");
            System.out.println("2. Get Fine By ID");
            System.out.println("3. Get All Fines");
            System.out.println("4. Get Member Fines");
            System.out.println("5. Get Total Outstanding Fine");
            System.out.println("6. Pay Fine");
            System.out.println("7. Waive Fine");
            System.out.println("8. Check Outstanding Fine");
            System.out.println("9. Back");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    calculateFine();
                    break;

                case 2:
                    getFineById();
                    break;

                case 3:
                    getAllFines();
                    break;

                case 4:
                    getMemberFines();
                    break;

                case 5:
                    getTotalOutstandingFine();
                    break;

                case 6:
                    payFine();
                    break;

                case 7:
                    waiveFine();
                    break;

                case 8:
                    hasOutstandingFine();
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // 1. Calculate Fine
    private void calculateFine() {

        System.out.print("Enter Issue ID: ");

        String issueId = scanner.nextLine();

        // Call proper method from Service
    }

    // 2. Get Fine By ID
    private void getFineById() {

        System.out.print("Enter Fine ID: ");

        String fineId = scanner.nextLine();

        // Call proper method from Service
    }

    // 3. Get All Fines
    private void getAllFines() {

        // Call proper method from Service
    }

    // 4. Get Member Fines
    private void getMemberFines() {

        System.out.print("Enter Member ID: ");

        String memberId = scanner.nextLine();

        // Call proper method from Service
    }

    // 5. Get Total Outstanding Fine
    private void getTotalOutstandingFine() {

        System.out.print("Enter Member ID: ");

        String memberId = scanner.nextLine();

        // Call proper method from Service
    }

    // 6. Pay Fine
    private void payFine() {

        System.out.print("Enter Fine ID: ");

        String fineId = scanner.nextLine();

        // Call proper method from Service
    }

    // 7. Waive Fine
    private void waiveFine() {

        System.out.print("Enter Fine ID: ");

        String fineId = scanner.nextLine();

        // Call proper method from Service
    }

    // 8. Check Outstanding Fine
    private void hasOutstandingFine() {

        System.out.print("Enter Member ID: ");

        String memberId = scanner.nextLine();

        // Call proper method from Service
    }
}