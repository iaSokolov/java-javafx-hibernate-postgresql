package ru.isokolov.example;

import java.io.IOException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Player p = new Player();
        p.setPassword("abc123");

        entityManager.persist(p);
        entityManager.getTransaction().commit();

        GUI.setRoot("secondary");
    }
}
