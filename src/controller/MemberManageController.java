package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.AddMemberModel;
import service.MemberService;

public class MemberManageController {

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtMemberName, txtMemberID, txtContact;

    @FXML
    private Button btnSave, btnHome;

    private MemberService memberService = new MemberService();  

    @FXML
    private void btnSaveOnAction() {
        String name = txtMemberName.getText();
        String id = txtMemberID.getText();
        String contact = txtContact.getText();

        
        AddMemberModel newMember = new AddMemberModel(name, id, contact);

        memberService.addMember(newMember);

        System.out.println("Saved Member: " + newMember);
    }

    @FXML
    private void btnHomeOnAction() throws IOException {
        System.out.println("Navigating to Home...");
        Parent node = FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }
}
