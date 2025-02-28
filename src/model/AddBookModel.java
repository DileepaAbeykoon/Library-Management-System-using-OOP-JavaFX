package model;

public class AddBookModel {

    private String author;
    private String isbn;
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AddBookModel(String author, String isbn, int publishedYear, String title) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    public AddBookModel() {
    }

    @Override
    public String toString() {
        return "AddBookModel [author=" + author + ", isbn=" + isbn + ", title="
                + title + "]";
    }

    
}
