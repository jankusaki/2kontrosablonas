package com.example.kontrasantrasis.utils;

import com.example.kontrasantrasis.fxControllers.FormWindowController;
import com.example.kontrasantrasis.StartApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {
    public static void openFormWindow(Button newBtn, GenericHibernate genericHibernate) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("form-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FormWindowController formWindowController = fxmlLoader.getController();
        formWindowController.onLoad(genericHibernate);
        Stage stage = (Stage) newBtn.getScene().getWindow();
        stage.setTitle("Main Window");
        stage.setScene(scene);
        stage.show();
    }
}
