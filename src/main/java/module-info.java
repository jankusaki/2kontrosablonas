module com.example.kontrasantrasis {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;



    opens com.example.kontrasantrasis to javafx.fxml, org.hibernate.orm.core;
    exports com.example.kontrasantrasis;
    exports com.example.kontrasantrasis.model;
    opens com.example.kontrasantrasis.model to javafx.fxml, org.hibernate.orm.core;
    exports com.example.kontrasantrasis.utils;
    opens com.example.kontrasantrasis.utils to javafx.fxml, org.hibernate.orm.core;
    exports com.example.kontrasantrasis.fxControllers;
    opens com.example.kontrasantrasis.fxControllers to javafx.fxml, org.hibernate.orm.core;
}