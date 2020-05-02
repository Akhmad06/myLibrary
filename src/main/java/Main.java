import com.lib.entity.Book;
import com.lib.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Book book = new Book();
        book.setId(1);
        book.setName("Harry Grotter");
        book.setGenre("Fantasy");
        book.setYear(2003);
        book.setNumOfPages(430);
        session.save(book);
        session.getTransaction().commit();
        session.close();
    }
}
