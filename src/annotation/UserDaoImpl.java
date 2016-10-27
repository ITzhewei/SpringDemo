package annotation;

import org.springframework.stereotype.Repository;

/**
 * Created by john on 2016/10/26.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao");
    }
}
