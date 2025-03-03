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
import model.RemoveBookModel;
import service.BookService;

public class RemoveBookController {

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtEnterIsbn;

    private BookService bookService = BookService.getInstance();

    @FXML
    void btnRemoveOnAction(ActionEvent event) {
        String isbn = txtEnterIsbn.getText();

        if (isbn.isEmpty()) {
            showAlert(AlertType.ERROR, "Form Error!", "Please enter the ISBN");
            return;
        }

        RemoveBookModel removeBookModel = new RemoveBookModel(isbn);
        String message = bookService.removeBookByISBN(removeBookModel.getIsbn());
        
        System.out.println(message);
        showAlert(AlertType.INFORMATION, "Remove Book", message);
    }

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        System.out.println("Navigating to Home...");
        Parent node = FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
