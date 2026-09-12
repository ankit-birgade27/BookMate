package com.bookmate.controller;
import java.util.Scanner;
import com.bookmate.service.BookService;
import java.util.List;
import com.bookmate.model.Author;
import com.bookmate.model.Book;
import com.bookmate.model.Category;
import com.bookmate.model.Publisher;

import com.bookmate.Exception.InvalidBookException;
import com.bookmate.Exception.InvalidSearchException;
import com.bookmate.Exception.AuthorNotFoundException;
import com.bookmate.Exception.BookNotFoundException;
import com.bookmate.Exception.BookOperationException;
import com.bookmate.Exception.CategoryNotFoundException;
import com.bookmate.Exception.DuplicateISBNException;


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

        // Book Details
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


        // Author Details
        Author author = new Author();

        System.out.print("Enter Author ID: ");
        author.setAuthorId(scanner.nextLine());

        System.out.print("Enter Author First Name: ");
        author.setFirstName(scanner.nextLine());

        System.out.print("Enter Author Last Name: ");
        author.setLastName(scanner.nextLine());

        System.out.print("Enter Author Biography: ");
        author.setBiography(scanner.nextLine());


        // Publisher Details
        Publisher publisher = new Publisher();

        System.out.print("Enter Publisher ID: ");
        publisher.setPublisherId(scanner.nextLine());

        System.out.print("Enter Publisher Name: ");
        publisher.setName(scanner.nextLine());

        System.out.print("Enter Publisher Email: ");
        publisher.setEmail(scanner.nextLine());

        System.out.print("Enter Publisher Phone: ");
        publisher.setPhone(scanner.nextLine());


        // Category Details
        Category category = new Category();

        System.out.print("Enter Category ID: ");
        category.setCategoryId(scanner.nextLine());

        System.out.print("Enter Category Name: ");
        category.setName(scanner.nextLine());

        System.out.print("Enter Category Description: ");
        category.setDescription(scanner.nextLine());


        // Set related objects into Book
        book.setPublicationYear(publicationYear);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setCategory(category);


        // Call Service
     
    }

    // 2. Get Book By ID
    private void getBookById() {

        System.out.print("Enter Book ID: ");

        String bookId = scanner.nextLine();

     
    }


    // 3. Get All Books
    private void getAllBooks() {

        List<Book> books = bookService.getAllBooks();

      
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

        // Author
        Author author = new Author();

        System.out.print("Enter Author ID: ");
        author.setAuthorId(scanner.nextLine());

        // Publisher
        Publisher publisher = new Publisher();

        System.out.print("Enter Publisher ID: ");
        publisher.setPublisherId(scanner.nextLine());

        // Category
        Category category = new Category();

        System.out.print("Enter Category ID: ");
        category.setCategoryId(scanner.nextLine());

        // Set objects into Book
        book.setPublicationYear(publicationYear);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setCategory(category);

        // Call Service
        try {
        		Book updatedBook = bookService.updateBook(book);
        		System.out.println("Book updated successfully.");
            System.out.println(updatedBook);
		} catch (InvalidBookException e) {
			System.out.println("Invalid Book: " + e.getMessage());
		} catch (BookNotFoundException e) {
			System.out.println("Book Not Found: " + e.getMessage());
		} catch (DuplicateISBNException e) {
			System.out.println("Duplicate ISBN: " + e.getMessage());
		} catch (AuthorNotFoundException e) {
			System.out.println("Author Not Found: " + e.getMessage());
		} catch (CategoryNotFoundException e) {
			System.out.println("Category Not Found: " + e.getMessage());
		}

        
    }


    // 5. Delete Book
    private void deleteBook() {

    System.out.print("Enter Book ID: ");
    String bookId = scanner.nextLine();

    try {

        bookService.deleteBook(bookId);

        System.out.println("Book deleted successfully.");

    } catch (InvalidBookException e) {

        System.out.println(
                "Invalid Book: " + e.getMessage());

    } catch (BookNotFoundException e) {

        System.out.println(
                "Book Not Found: " + e.getMessage());

    } catch (BookOperationException e) {

        System.out.println(
                "Book Operation Error: " + e.getMessage());
    }
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
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Description: " + book.getDescription());
            }
        }

    } catch (InvalidSearchException e) {

        System.out.println("Invalid Search: " + e.getMessage());

    } catch (BookOperationException e) {

        System.out.println("Book Operation Error: " + e.getMessage());
    }
}


    // 7. Get Books By Category
    private void getBooksByCategory() {

        System.out.print("Enter Category ID: ");

        String categoryId = scanner.nextLine();

      
    }


    // 8. Get Books By Author
    private void getBooksByAuthor() {

        System.out.print("Enter Author ID: ");

        String authorId = scanner.nextLine();

      
    }

    // 9. Check Book Exists
    private void bookExists() {

        System.out.print("Enter Book ID: ");

        String bookId = scanner.nextLine();

       
    }
}