package fabrica;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.jpa.internal.EntityManagerImpl;

public class Fabrica {
	private static Fabrica fabrica;
	private EntityManager em;
        private static EntityManagerFactory emf;

	public Fabrica() {
		em = Persistence.createEntityManagerFactory("IgrejaPU").createEntityManager();
	}
         public static EntityManagerFactory get() {
        return emf;
    }

	public synchronized static Fabrica getFabrica() {
		if (fabrica == null) {
			fabrica = new Fabrica();
		}
		return fabrica;
	}

	public EntityManager getEm() {
		return em;
	}

	public Connection getConnection() {
		EntityManagerImpl factory = (EntityManagerImpl) em;
		SessionFactoryImpl sessionFactoryImpl = (SessionFactoryImpl) factory.getSession().getSessionFactory();
		try {
			return sessionFactoryImpl.getConnectionProvider().getConnection();
		} catch (SQLException ex) {
			Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
}
