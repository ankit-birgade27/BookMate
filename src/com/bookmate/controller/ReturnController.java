package com.bookmate.controller;

import java.util.Scanner;

import com.bookmate.service.ReturnService;

public class ReturnController {

    private ReturnService returnService;

    private Scanner scanner = new Scanner(System.in);

    public ReturnController(ReturnService returnService) {
        this.returnService = returnService;
    }

    public void start() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("         RETURN MANAGEMENT");
            System.out.println("================================");

            System.out.println("1. Return Book");
            System.out.println("2. Get Return By ID");
            System.out.println("3. Get Return By Issue ID");
            System.out.println("4. Calculate Overdue Days");
            System.out.println("5. Check Overdue");
            System.out.println("6. Back");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    returnBook();
                    break;

                case 2:
                    getReturnById();
                    break;

                case 3:
                    getReturnByIssueId();
                    break;

                case 4:
                    calculateOverdueDays();
                    break;

                case 5:
                    isOverdue();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


    // 1. Return Book
    private void returnBook() {

        System.out.print("Enter Issue ID: ");
        String issueId = scanner.nextLine();

        // Call proper method from Service
    }


    // 2. Get Return By ID
    private void getReturnById() {

        System.out.print("Enter Return ID: ");
        String returnId = scanner.nextLine();

        // Call proper method from Service
    }


    // 3. Get Return By Issue ID
    private void getReturnByIssueId() {

        System.out.print("Enter Issue ID: ");
        String issueId = scanner.nextLine();

        // Call proper method from Service
    }


    // 4. Calculate Overdue Days
    private void calculateOverdueDays() {

        System.out.print("Enter Issue ID: ");
        String issueId = scanner.nextLine();

        // Call proper method from Service
    }


    // 5. Check Overdue
    private void isOverdue() {

        System.out.print("Enter Issue ID: ");
        String issueId = scanner.nextLine();

        // Call proper method from Service
    }
}