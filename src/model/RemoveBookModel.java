package model;

public class RemoveBookModel {
    private String isbn;

    public RemoveBookModel(String isbn) {
        this.isbn = isbn;
    }

    public RemoveBookModel() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "RemoveBookModel [isbn=" + isbn + "]";
    }
}
