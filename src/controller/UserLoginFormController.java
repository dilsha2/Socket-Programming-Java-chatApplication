package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLoginFormController {
    public AnchorPane loginFormContext;
    public TextField txtUserName;
    static String userName;

    public void LogInAction(ActionEvent actionEvent) throws IOException {
        userName=txtUserName.getText();
        Stage stage = (Stage) txtUserName.getScene().getWindow();
        stage.close();
        Stage stage1=new Stage();
        stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ClientForm.fxml"))));
        stage1.setResizable(false);
        //primaryStage.getIcons().add(new Image("location"));
        stage1.setTitle("Group Chat Application");
        stage1.centerOnScreen();
        stage1.show();
    }
}
