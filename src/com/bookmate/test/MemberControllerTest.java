package com.bookmate.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.bookmate.controller.MemberController;
import com.bookmate.dao.MemberDao;
import com.bookmate.model.Member;
import com.bookmate.service.MemberService;
import com.bookmate.serviceimpl.MemberServiceImpl;
import com.bookmate.storage.DataStore;

public class MemberControllerTest {

    private MemberDao memberDao;
    private MemberService memberService;
    private MemberController memberController;

    private final PrintStream originalOut = System.out;


    public static void main(String[] args) {

        MemberControllerTest test = new MemberControllerTest();

        test.testGetAllMembersWithMembers();
        test.testGetAllMembersWithNoMembers();

        System.out.println("\nAll member controller tests completed.");
    }


    private void setUp(String input) {

        memberDao = new MemberDao();

        memberService = new MemberServiceImpl(memberDao);

        DataStore.getMembers().clear();

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes());

        System.setIn(inputStream);

        memberController = new MemberController(memberService);
    }


    // ---------------------------------------------------------
    // Test 1: Get All Members When Members Exist
    // ---------------------------------------------------------

    public void testGetAllMembersWithMembers() {

        setUp("3\n10\n");


        Member member1 = new Member();

        member1.setMemberId("M001");
        member1.setFirstName("Satyam");
        member1.setLastName("Shinde");


        Member member2 = new Member();

        member2.setMemberId("M002");
        member2.setFirstName("Rahul");
        member2.setLastName("Patil");


        DataStore.getMembers().add(member1);
        DataStore.getMembers().add(member2);


        ByteArrayOutputStream outputStream =
                new ByteArrayOutputStream();

        System.setOut(new PrintStream(outputStream));


        memberController.start();


        System.setOut(originalOut);


        String output = outputStream.toString();


        assertTrue(
                output.contains("ALL MEMBERS"),
                "Controller should display ALL MEMBERS"
        );


        System.out.println(
                "PASS: testGetAllMembersWithMembers"
        );
    }


    // ---------------------------------------------------------
    // Test 2: Get All Members When No Members Exist
    // ---------------------------------------------------------

    public void testGetAllMembersWithNoMembers() {

        setUp("3\n10\n");


        ByteArrayOutputStream outputStream =
                new ByteArrayOutputStream();

        System.setOut(new PrintStream(outputStream));


        memberController.start();


        System.setOut(originalOut);


        String output = outputStream.toString();


        assertTrue(
                output.contains("No members found."),
                "Controller should display No members found."
        );


        System.out.println(
                "PASS: testGetAllMembersWithNoMembers"
        );
    }


    // ---------------------------------------------------------
    // Assertion Method
    // ---------------------------------------------------------

    private void assertTrue(
            boolean condition,
            String message) {

        if (!condition) {
            throw new AssertionError(message);
        }
    }
}