package com.bookmate.controller;



import java.time.LocalDate;
import java.util.Scanner;

import com.bookmate.service.IssueService;

public class IssueController {

    private IssueService issueService;

    private Scanner scanner = new Scanner(System.in);

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    public void start() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("        ISSUE MANAGEMENT");
            System.out.println("================================");

            System.out.println("1. Issue Book");
            System.out.println("2. Get Issue By ID");
            System.out.println("3. Get All Issues");
            System.out.println("4. Get Member Issue History");
            System.out.println("5. Get Active Issues");
            System.out.println("6. Check Can Issue Book");
            System.out.println("7. Renew Book");
            System.out.println("8. Back");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    issueBook();
                    break;

                case 2:
                    getIssueById();
                    break;

                case 3:
                    getAllIssues();
                    break;

                case 4:
                    getMemberIssueHistory();
                    break;

                case 5:
                    getActiveIssues();
                    break;

                case 6:
                    canIssueBook();
                    break;

                case 7:
                    renewBook();
                    break;

                case 8:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


    // 1. Issue Book
    private void issueBook() {

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();

        System.out.print("Enter Book Copy ID: ");
        String copyId = scanner.nextLine();

        // Call proper method from Service
    }


    // 2. Get Issue By ID
    private void getIssueById() {

        System.out.print("Enter Issue ID: ");
        String issueId = scanner.nextLine();

        // Call proper method from Service
    }


    // 3. Get All Issues
    private void getAllIssues() {

        // Call proper method from Service
    }


    // 4. Get Member Issue History
    private void getMemberIssueHistory() {

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();

        // Call proper method from Service
    }


    // 5. Get Active Issues
    private void getActiveIssues() {

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();

        // Call proper method from Service
    }


    // 6. Check Can Issue Book
    private void canIssueBook() {

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();

        System.out.print("Enter Book Copy ID: ");
        String copyId = scanner.nextLine();

        // Call proper method from Service
    }


    // 7. Renew Book
    private void renewBook() {

        System.out.print("Enter Issue ID: ");
        String issueId = scanner.nextLine();

        // Call proper method from Service
    }
}