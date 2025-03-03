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

    public String removeBookByISBN(String isbn) {
    for (int i = 0; i < bookCount; i++) {
        if (books[i] != null && books[i].getIsbn().equals(isbn)) {
            for (int j = i; j < bookCount - 1; j++) {
                books[j] = books[j + 1];
            }
            books[bookCount - 1] = null; 
            bookCount--;
            return "Book removed successfully!";
        }
    }
    return "Book not found!";
}


    public AddBookModel[] getBooks() {
        return books;
    }

    public int getBookCount() {
        return bookCount;
    }
}
