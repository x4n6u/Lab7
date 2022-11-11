package ca.sait.dataaccess;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Joshs
 */
public class DBUtil {
     private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("UserPU");

    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}

