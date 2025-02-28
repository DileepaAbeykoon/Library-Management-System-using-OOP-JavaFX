package controller;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.AddBookModel;
import service.BookService;

public class DisplayBookController {

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<AddBookModel> bookTable;

    @FXML
    private TableColumn<AddBookModel, String> authorColumn;

    @FXML
    private TableColumn<AddBookModel, String> isbnColumn;

    @FXML
    private TableColumn<AddBookModel, String> titleColumn;

    private BookService bookService = BookService.getInstance();

    @FXML
    void initialize() {
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        isbnColumn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
    }

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        System.out.println("Navigating to Home...");
        Parent node = FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @FXML
    void btnLoadOnAction(ActionEvent event) {
        System.out.println("Loading Books...");
        loadBooks();
    }

    private void loadBooks() {
        AddBookModel[] books = bookService.getBooks();
        int bookCount = bookService.getBookCount();

        System.out.println("Book count: " + bookCount); 

        if (books == null) {
            System.out.println("Books array is null");
            return;
        }

        ObservableList<AddBookModel> bookList = FXCollections.observableArrayList();
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null) {
                System.out.println("Adding book: " + books[i]); 
                bookList.add(books[i]);
            } else {
                System.out.println("Book at index " + i + " is null");
            }
        }

        bookTable.setItems(bookList);
        System.out.println("Books loaded into TableView: " + bookList.size()); 
    }
}