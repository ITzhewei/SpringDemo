package jdbc.c3p0;

import jdbc.doamin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by john on 2016/10/27.
 */
@Repository("UserDao2")
public class UserDao {
    //jdbc的模板将由spring注入

    @Autowired
    @Qualifier("jdbcTemplate2")
    private JdbcTemplate jdbcTemplate;

    public void update(User user) {
//        String sql = "update t_user set username=?,password=? where id =?";
//        Object[] args = {user.getUsername(), user.getPassword(), user.getId()};
//        jdbcTemplate.update(sql, args);
        String sql = "update t_user set username=?,password=? where id =?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        jdbcTemplate.update(sql, args);
    }
}
