import com.lib.entity.Author;
import com.lib.entity.Book;
import com.lib.entity.Library;
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
        book.setName("Hobbyt");
        book.setGenre("Fantasy");
        book.setYear(1947);
        book.setNumOfPages(390);
        session.save(book);

        Library library = new Library();
        library.setId(1);
        library.setName("Lennyns Library");
        library.setAddress("Red square");
        session.save(library);

        Author author = new Author();
        author.setId(1);
        author.setName("Yurij");
        author.setSecondName("Nikitin");
        author.setYear(1976);
        session.save(author);

        session.getTransaction().commit();
        session.close();


    }
}
