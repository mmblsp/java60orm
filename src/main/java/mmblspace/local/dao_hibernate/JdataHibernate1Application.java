package mmblspace.local.dao_hibernate;

import mmblspace.local.dao_hibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class JdataHibernate1Application implements CommandLineRunner {
    @PersistenceContext
    private EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication.run(JdataHibernate1Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        System.out.println(entityManager.createQuery("from Person", Person.class).getResultList());
    }
}
