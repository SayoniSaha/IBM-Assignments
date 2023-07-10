package org.pro.project30_10jul;

/**
 * Hello world!
 *
 */

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Comment;
import model.Tutorial;

public class App {
    public static void main(String[] args) {
        try {
            SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Tutorial.class)
                    .addAnnotatedClass(Comment.class)
                    .buildSessionFactory();
            Session session = sf.openSession();

            session.getTransaction().begin();
            
            
            Tutorial tutorial3 = new Tutorial();
            tutorial3.setTitle("Java");
            tutorial3.setDescription("Core Java");
            tutorial3.setPublished(true);
            
            Tutorial tutorial4 = new Tutorial();
            tutorial4.setTitle("Python");
            tutorial4.setDescription("Basic Python");
            tutorial4.setPublished(true);
            
            session.save(tutorial3);
            session.save(tutorial4);
            Integer tutorialId = tutorial3.getId();
            
            session.getTransaction().commit();
            
            System.out.println("Data added successfully");
            
            // Retrieve the tutorial by its ID
            session = sf.openSession();
            session.getTransaction().begin();
            
            Tutorial x = session.get(Tutorial.class, tutorialId);
            System.out.println(x);
            
            session.getTransaction().commit();
            
            
            Tutorial tutorial = session.get(Tutorial.class, 1);
            
            session.getTransaction().begin();
            
            Comment comment1 = new Comment();
            comment1.setContent("abc");
            comment1.setTutorial(tutorial);

            Comment comment2 = new Comment();
            comment2.setContent("xyz");
            comment2.setTutorial(tutorial);

            session.save(comment1);
            session.save(comment2);

            session.getTransaction().commit();

            
            
//            Get all data
            session.getTransaction().begin();

            List<Tutorial> tutorials = session.createQuery("FROM Tutorial", Tutorial.class).getResultList();
            for (Tutorial tutorial5 : tutorials) {
                System.out.println(tutorial5);
            }

            session.getTransaction().commit();
            
//            
//            Find by id
            session.getTransaction().begin();

            Tutorial tutorial2 = session.find(Tutorial.class, 1);
            if (tutorial2 != null) {
                System.out.println(tutorial2);
            } else {
                System.out.println("Invalid input");
            }

            session.getTransaction().commit();

            System.out.println("Completed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
