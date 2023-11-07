package com.example.kontrasantrasis;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.fxml.Initializable;


import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kontrasantrasis");
    GenericHibernate genericHibernate= new GenericHibernate(entityManagerFactory);
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
