package com.example.kontrasantrasis.fxControllers;

import com.example.kontrasantrasis.utils.GenericHibernate;
import com.example.kontrasantrasis.utils.SceneSwitcher;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    public Button newBtn;
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kontrasantrasis");
    GenericHibernate genericHibernate= new GenericHibernate(entityManagerFactory);
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void openForm() throws IOException {
        SceneSwitcher.openFormWindow(newBtn, genericHibernate);
    }
}
