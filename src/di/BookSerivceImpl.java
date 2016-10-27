package di;

/**
 * Created by john on 2016/10/25.
 */
public class BookSerivceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void addBook() {
        bookDao.addBook();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
