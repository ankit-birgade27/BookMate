package com.bookmate.controller;

import com.bookmate.exception.InvalidSearchException;
import com.bookmate.service.BookService;
import com.bookmate.model.Author;
import com.bookmate.model.Book;
import com.bookmate.model.Category;
import com.bookmate.model.Publisher;

import java.util.List;
import java.util.Scanner;

public class BookController {

    private BookService bookService;
    private Scanner scanner = new Scanner(System.in);

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void start() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("       BOOK MANAGEMENT");
            System.out.println("================================");

            System.out.println("1. Add Book");
            System.out.println("2. Get Book By ID");
            System.out.println("3. Get All Books");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Search Books");
            System.out.println("7. Books By Category");
            System.out.println("8. Books By Author");
            System.out.println("9. Check Book Exists");
            System.out.println("10. Back");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    getBookById();
                    break;

                case 3:
                    getAllBooks();
                    break;

                case 4:
                    updateBook();
                    break;

                case 5:
                    deleteBook();
                    break;

                case 6:
                    searchBooks();
                    break;

                case 7:
                    getBooksByCategory();
                    break;

                case 8:
                    getBooksByAuthor();
                    break;

                case 9:
                    bookExists();
                    break;

                case 10:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // 1. Add Book
    private void addBook() {

        Book book = new Book();

        System.out.print("Enter Book ID: ");
        book.setBookId(scanner.nextLine());

        System.out.print("Enter ISBN: ");
        book.setIsbn(scanner.nextLine());

        System.out.print("Enter Book Title: ");
        book.setTitle(scanner.nextLine());

        System.out.print("Enter Description: ");
        book.setDescription(scanner.nextLine());

        System.out.print("Enter Publication Year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine();

        // Author
        Author author = new Author();

        System.out.print("Enter Author ID: ");
        author.setAuthorId(scanner.nextLine());

        System.out.print("Enter Author First Name: ");
        author.setFirstName(scanner.nextLine());

        System.out.print("Enter Author Last Name: ");
        author.setLastName(scanner.nextLine());

        System.out.print("Enter Author Biography: ");
        author.setBiography(scanner.nextLine());

        // Publisher
        Publisher publisher = new Publisher();

        System.out.print("Enter Publisher ID: ");
        publisher.setPublisherId(scanner.nextLine());

        System.out.print("Enter Publisher Name: ");
        publisher.setName(scanner.nextLine());

        System.out.print("Enter Publisher Email: ");
        publisher.setEmail(scanner.nextLine());

        System.out.print("Enter Publisher Phone: ");
        publisher.setPhone(scanner.nextLine());

        // Category
        Category category = new Category();

        System.out.print("Enter Category ID: ");
        category.setCategoryId(scanner.nextLine());

        System.out.print("Enter Category Name: ");
        category.setName(scanner.nextLine());

        System.out.print("Enter Category Description: ");
        category.setDescription(scanner.nextLine());

        // Set values
        book.setPublicationYear(publicationYear);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setCategory(category);

        // Call Service
        bookService.addBook(book);

        System.out.println("Book added successfully.");
    }

    // 2. Get Book By ID
    private void getBookById() {

        System.out.print("Enter Book ID: ");

        String bookId = scanner.nextLine();

        Book book = bookService.getBookById(bookId);

        if (book != null) {
            System.out.println("Book found:");
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    // 3. Get All Books
    private void getAllBooks() {

        List<Book> books = bookService.getAllBooks();

        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {

            System.out.println("All Books:");

            for (Book book : books) {

                System.out.println("----------------------------");
                System.out.println("Book ID     : " + book.getBookId());
                System.out.println("ISBN        : " + book.getIsbn());
                System.out.println("Title       : " + book.getTitle());
                System.out.println("Description : " + book.getDescription());
            }
        }
    }

    // 4. Update Book
    private void updateBook() {

        Book book = new Book();

        System.out.print("Enter Book ID: ");
        book.setBookId(scanner.nextLine());

        System.out.print("Enter Book Title: ");
        book.setTitle(scanner.nextLine());

        System.out.print("Enter ISBN: ");
        book.setIsbn(scanner.nextLine());

        System.out.print("Enter Description: ");
        book.setDescription(scanner.nextLine());

        System.out.print("Enter Publication Year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine();

        Author author = new Author();

        System.out.print("Enter Author ID: ");
        author.setAuthorId(scanner.nextLine());

        Publisher publisher = new Publisher();

        System.out.print("Enter Publisher ID: ");
        publisher.setPublisherId(scanner.nextLine());

        Category category = new Category();

        System.out.print("Enter Category ID: ");
        category.setCategoryId(scanner.nextLine());

        book.setPublicationYear(publicationYear);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setCategory(category);

        Book updatedBook = bookService.updateBook(book);

        System.out.println("Book updated successfully.");
        System.out.println(updatedBook);
    }

    // 5. Delete Book
    private void deleteBook() {

        System.out.print("Enter Book ID: ");

        String bookId = scanner.nextLine();

        bookService.deleteBook(bookId);

        System.out.println("Book deleted successfully.");
    }

    // 6. Search Books
    private void searchBooks() {

        System.out.print("Enter search keyword: ");

        String keyword = scanner.nextLine();

        try {

            List<Book> books = bookService.searchBooks(keyword);

            if (books.isEmpty()) {

                System.out.println("No books found.");

            } else {

                System.out.println("Books found:");

                for (Book book : books) {

                    System.out.println("----------------------------");
                    System.out.println("Book ID     : " + book.getBookId());
                    System.out.println("ISBN        : " + book.getIsbn());
                    System.out.println("Title       : " + book.getTitle());
                    System.out.println("Description : " + book.getDescription());

                    if (book.getAuthor() != null) {

                        System.out.println("Author      : "
                                + book.getAuthor().getFirstName()
                                + " "
                                + book.getAuthor().getLastName());
                    }

                    if (book.getCategory() != null) {

                        System.out.println("Category    : "
                                + book.getCategory().getName());
                    }
                }
            }

        } catch (InvalidSearchException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("Book operation failed: "
                    + e.getMessage());
        }
    }

    // 7. Get Books By Category
    private void getBooksByCategory() {

        System.out.print("Enter Category ID: ");

        String categoryId = scanner.nextLine();

        List<Book> books =
                bookService.getBooksByCategory(categoryId);

        if (books.isEmpty()) {

            System.out.println("No books found for this category.");

        } else {

            for (Book book : books) {

                System.out.println("----------------------------");
                System.out.println("Book ID : " + book.getBookId());
                System.out.println("Title   : " + book.getTitle());
                System.out.println("ISBN    : " + book.getIsbn());
            }
        }
    }

    // 8. Get Books By Author
    private void getBooksByAuthor() {

        System.out.print("Enter Author ID: ");

        String authorId = scanner.nextLine();

        List<Book> books =
                bookService.getBooksByAuthor(authorId);

        if (books.isEmpty()) {

            System.out.println("No books found for this author.");

        } else {

            for (Book book : books) {

                System.out.println("----------------------------");
                System.out.println("Book ID : " + book.getBookId());
                System.out.println("Title   : " + book.getTitle());
                System.out.println("ISBN    : " + book.getIsbn());
            }
        }
    }

    // 9. Check Book Exists
    private void bookExists() {

        System.out.print("Enter Book ID: ");

        String bookId = scanner.nextLine();

        boolean exists = bookService.bookExists(bookId);

        if (exists) {

            System.out.println("Book exists.");

        } else {

            System.out.println("Book does not exist.");
        }
    }
}