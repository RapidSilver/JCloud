package com.gb.cloud.client;

import com.gb.cloud.common.MyFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginLayoutController {

@FXML
TextField loginField;

@FXML
PasswordField passField;

@FXML
Button authButton;

@FXML
Button regButton;


    public void autorize(ActionEvent actionEvent) {
        System.out.println(loginField.getText());
        System.out.println(passField.getText());
    }


    public void goToRegpage(ActionEvent actionEvent) {
        regButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/regLayout.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
