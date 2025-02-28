package service;

import model.AddBookModel;

public class BookService {
    private static final int MAX_BOOKS = 500;
    private AddBookModel[] books = new AddBookModel[MAX_BOOKS];
    private int bookCount = 0;

    private static BookService instance = new BookService(); 

    private BookService() {
    }

    public static BookService getInstance() {
        return instance;
    }

    public String addBook(String author, String isbn, String title) {
        if (bookCount < MAX_BOOKS) {
            AddBookModel newBook = new AddBookModel(author, isbn, bookCount, title);
            books[bookCount] = newBook;
            bookCount++;
            return "Book added successfully!";
        } else {
            return "Book store is full!";
        }
    }

    public AddBookModel[] getBooks() {
        return books;
    }

    public int getBookCount() {
        return bookCount;
    }
}
