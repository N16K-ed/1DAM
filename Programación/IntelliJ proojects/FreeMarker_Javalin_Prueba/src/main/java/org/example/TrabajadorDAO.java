package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TrabajadorDAO {
    private static final SessionFactory sessionFactory;

    static {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // Configura desde hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw new ExceptionInInitializerError("Initial SessionFactory creation failed" + e);
        }
    }

    public static void guardarUsuario(Trabajador trabajador) {
        var session = sessionFactory.openSession();
        var transaction = session.beginTransaction();
        session.merge(trabajador); // Usar merge en lugar de persist
        transaction.commit();
        session.close();
    }
}