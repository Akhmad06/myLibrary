import com.lib.entity.Library;
import com.lib.entity.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Library library = new Library();
        library.setName("Number 1");
        session.save(library);
        session.getTransaction().commit();
        session.close();
    }
}
