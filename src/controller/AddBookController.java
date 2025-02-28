package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import service.BookService;

public class AddBookController {

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtEnterAuthor;

    @FXML
    private TextField txtEnterIsbn;

    @FXML
    private TextField txtEnterTitle;

    private BookService bookService = BookService.getInstance();

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        System.out.println("Navigating to Home...");
        Parent node = FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String author = txtEnterAuthor.getText();
        String isbn = txtEnterIsbn.getText();
        String title = txtEnterTitle.getText();

        if (author.isEmpty() || isbn.isEmpty() || title.isEmpty()) {
            showAlert(AlertType.ERROR, "Form Error!", "Please enter all fields");
            return;
        }

        String message = bookService.addBook(author, isbn, title);
        System.out.println(message);
        showAlert(AlertType.INFORMATION, "Success", message);
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}