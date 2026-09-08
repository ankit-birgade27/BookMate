package com.bookmate.controller;

import java.time.LocalDate;
import java.util.Scanner;

import com.bookmate.enums.MemberStatus;
import com.bookmate.model.Member;
import com.bookmate.service.MemberService;

public class MemberController {

    private MemberService memberService;

    private Scanner scanner = new Scanner(System.in);

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    public void start() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("      MEMBER MANAGEMENT");
            System.out.println("================================");

            System.out.println("1. Register Member");
            System.out.println("2. Get Member By ID");
            System.out.println("3. Get All Members");
            System.out.println("4. Update Member");
            System.out.println("5. Delete Member");
            System.out.println("6. Search Members");
            System.out.println("7. Activate Member");
            System.out.println("8. Suspend Member");
            System.out.println("9. Check Member Exists");
            System.out.println("10. Back");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    registerMember();
                    break;

                case 2:
                    getMemberById();
                    break;

                case 3:
                    getAllMembers();
                    break;

                case 4:
                    updateMember();
                    break;

                case 5:
                    deleteMember();
                    break;

                case 6:
                    searchMembers();
                    break;

                case 7:
                    activateMember();
                    break;

                case 8:
                    suspendMember();
                    break;

                case 9:
                    memberExists();
                    break;

                case 10:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


    // 1. Register Member
    private void registerMember() {

        Member member = new Member();

        System.out.print("Enter Member ID: ");
        member.setMemberId(scanner.nextLine());

        System.out.print("Enter First Name: ");
        member.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        member.setLastName(scanner.nextLine());

        System.out.print("Enter Registration Date (yyyy-mm-dd): ");
        member.setRegistrationDate(
                LocalDate.parse(scanner.nextLine())
        );

        System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
        member.setExpiryDate(
                LocalDate.parse(scanner.nextLine())
        );

        System.out.print("Enter Member Status: ");
        member.setStatus(
                MemberStatus.valueOf(scanner.nextLine().toUpperCase())
        );

      //call service method
    }


    // 2. Get Member By ID
    private void getMemberById() {

        System.out.print("Enter Member ID: ");

        String memberId = scanner.nextLine();

      //call service method
    }


    // 3. Get All Members
    private void getAllMembers() {

        // Student will write Service call here
    }


    // 4. Update Member
    private void updateMember() {

        Member member = new Member();

        System.out.print("Enter Member ID: ");
        member.setMemberId(scanner.nextLine());

        System.out.print("Enter First Name: ");
        member.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        member.setLastName(scanner.nextLine());

        System.out.print("Enter Registration Date (yyyy-mm-dd): ");
        member.setRegistrationDate(
                LocalDate.parse(scanner.nextLine())
        );

        System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
        member.setExpiryDate(
                LocalDate.parse(scanner.nextLine())
        );

        System.out.print("Enter Member Status: ");
        member.setStatus(
                MemberStatus.valueOf(scanner.nextLine().toUpperCase())
        );

        //call service method
    }


    // 5. Delete Member
    private void deleteMember() {

        System.out.print("Enter Member ID: ");

        String memberId = scanner.nextLine();

      //call service method
    }


    // 6. Search Members
    private void searchMembers() {

        System.out.print("Enter search keyword: ");

        String keyword = scanner.nextLine();

        // Student will write Service call here
    }


    // 7. Activate Member
    private void activateMember() {

        System.out.print("Enter Member ID: ");

        String memberId = scanner.nextLine();

      //call service method
    }


    // 8. Suspend Member
    private void suspendMember() {

        System.out.print("Enter Member ID: ");

        String memberId = scanner.nextLine();

      //call service method
    }


    // 9. Check Member Exists
    private void memberExists() {

        System.out.print("Enter Member ID: ");

        String memberId = scanner.nextLine();

      //call service method
    }
}