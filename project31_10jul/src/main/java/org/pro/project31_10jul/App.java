package org.pro.project31_10jul;

/**
 * Hello world!
 *
 */

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Singer;
import model.Album;
import model.NationalAlbum;
import model.InternationalAlbum;


public class App {
    public static void main(String[] args) {
        try {
            SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Singer.class)
                    .addAnnotatedClass(Album.class)
                    .addAnnotatedClass(NationalAlbum.class)
                    .addAnnotatedClass(InternationalAlbum.class)
                    .buildSessionFactory();
            Session session = sf.openSession();
            session.getTransaction().begin();

            Singer singer1 = new Singer();
            singer1.setSingerName("ab cd");
            singer1.setSingerCountry("C1");

            Singer singer2 = new Singer();
            singer2.setSingerName("ef gh");
            singer2.setSingerCountry("C2");

            NationalAlbum nationalAlbum = new NationalAlbum(2, "ABC",29.99, "def",Arrays.asList(singer1));

            InternationalAlbum internationalAlbum = new InternationalAlbum(3, "XYZ", 39.99, "uvw",Arrays.asList(singer2));

            session.save(singer1);
            session.save(singer2);
            session.save(nationalAlbum);
            session.save(internationalAlbum);

            session.getTransaction().commit();
            session.close();

            System.out.println("Created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
