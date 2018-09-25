package com.gb.cloud.client;

import com.gb.cloud.common.MyFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;




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
}
