package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class MainController {

     @FXML
    private AnchorPane root;

    @FXML
    void btnBookManagementOnAction(ActionEvent event) throws IOException {
            System.out.println("Book Management");
            /*URL resource = this.getClass().getResource("/view/BookManagement.fxml");
            Parent root = FXMLLoader.load(resource);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            stage.setTitle("Book Management");*/

            this.root.getChildren().clear();
            Parent node = FXMLLoader.load(this.getClass().getResource("/view/BookManagement.fxml"));
            this.root.getChildren().add(node);
    }

    @FXML
    void btnExitOnAction(ActionEvent event) {
        System.out.println("Exit");
        System.exit(0);
    }

    @FXML
    void btnMembersManagementOnAction(ActionEvent event) throws IOException {
        System.out.println("Members Management");
        /*URL resource = this.getClass().getResource("/view/AddMember.fxml");
            Parent root = FXMLLoader.load(resource);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            stage.setTitle("Add Member");*/

            this.root.getChildren().clear();
            Parent node = FXMLLoader.load(this.getClass().getResource("/view/AddMember.fxml"));
            this.root.getChildren().add(node);
    }
}
