package com.bookmate.main;

import com.bookmate.controller.BookController;
import com.bookmate.controller.FineController;
import com.bookmate.controller.IssueController;
import com.bookmate.controller.LibraryController;
import com.bookmate.controller.MemberController;
import com.bookmate.controller.ReservationController;
import com.bookmate.controller.ReturnController;
import com.bookmate.dao.Bookdao;
import com.bookmate.dao.FineDao;
import com.bookmate.dao.Issuedao;
import com.bookmate.dao.MemberDao;
import com.bookmate.dao.ReservationDao;
import com.bookmate.dao.ReturnDao;
import com.bookmate.service.BookService;
import com.bookmate.service.FineService;
import com.bookmate.service.IssueService;
import com.bookmate.service.MemberService;
import com.bookmate.service.ReservationService;
import com.bookmate.service.ReturnService;
import com.bookmate.serviceimpl.BookServiceImpl;
import com.bookmate.serviceimpl.FineServiceImpl;
import com.bookmate.serviceimpl.IssueServiceImpl;
import com.bookmate.serviceimpl.MemberServiceImpl;
import com.bookmate.serviceimpl.ReservationServiceImpl;
import com.bookmate.serviceimpl.ReturnServiceImpl;





public class Main {

    public static void main(String[] args) {

        // =========================
        // DAO OBJECTS
        // =========================

        MemberDao memberDAO = new MemberDao();
        Bookdao bookDAO = new Bookdao();
        Issuedao issueDAO = new Issuedao();
        ReturnDao returnDAO = new ReturnDao();
        ReservationDao reservationDAO = new ReservationDao();
        FineDao fineDAO = new FineDao();


        // =========================
        // SERVICE OBJECTS
        // =========================

        MemberService memberService =
                new MemberServiceImpl(memberDAO);

        BookService bookService =
                new BookServiceImpl(bookDAO);

        IssueService issueService =
                new IssueServiceImpl(issueDAO);

        ReturnService returnService =
                new ReturnServiceImpl(returnDAO);

        ReservationService reservationService =
                new ReservationServiceImpl(reservationDAO);

        FineService fineService =
                new FineServiceImpl(fineDAO);


        // =========================
        // CONTROLLER OBJECTS
        // =========================

        MemberController memberController =
                new MemberController(memberService);

        BookController bookController =
                new BookController(bookService);

        IssueController issueController =
                new IssueController(issueService);

        ReturnController returnController =
                new ReturnController(returnService);

        ReservationController reservationController =
                new ReservationController(reservationService);

        FineController fineController =
                new FineController(fineService);


        // =========================
        // MAIN LIBRARY CONTROLLER
        // =========================

        LibraryController libraryController =
                new LibraryController(
                        memberController,
                        bookController,
                        issueController,
                        returnController,
                        reservationController,
                        fineController
                );
        // =========================
        // START APPLICATION
        // =========================

        libraryController.start();
    }
}