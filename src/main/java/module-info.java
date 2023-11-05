module ru.isokolov {
    requires java.sql;               // sql module (externalized) dependencies
    requires org.postgresql.jdbc;    // postgresql driver (internal) dependencies
    requires java.naming;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;

    opens ru.isokolov.example to javafx.fxml,  javafx.controls, org.hibernate.orm.core;
    exports ru.isokolov.example;
}
