package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class BookManagementController {

    @FXML
    private AnchorPane root;

    @FXML
    void btnAddBookOnAction(ActionEvent event) throws IOException {
        System.out.println("Add Book");
        /*URL resource = this.getClass().getResource("/view/AddBook.fxml");
            Parent root = FXMLLoader.load(resource);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            stage.setTitle("Add Book");*/

            this.root.getChildren().clear();
            Parent node = FXMLLoader.load(this.getClass().getResource("/view/AddBook.fxml"));
            this.root.getChildren().add(node);
    }

    @FXML
    void btnDisplayBooksOnAction(ActionEvent event) throws IOException {
        System.out.println("Display Books");
        this.root.getChildren().clear();
            Parent node = FXMLLoader.load(this.getClass().getResource("/view/DisplayBook.fxml"));
            this.root.getChildren().add(node);
    }

    @FXML
    void btnMainMenuOnAction(ActionEvent event) {
        System.out.println("Main Menu");
    }

    @FXML
    void btnRemoveBookOnAction(ActionEvent event) {
        System.out.println("Remove Book");
    }

    @FXML
    void btnSearchBookOnAction(ActionEvent event) {
        System.out.println("Search Book");
    }
}
