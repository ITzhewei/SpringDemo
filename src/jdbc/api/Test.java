package jdbc.api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by john on 2016/10/27.
 */
public class Test {
    public static void main(String[] args) {
        //1.创建数据源
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/day1027");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //2.创建模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        //3.使用api
        jdbcTemplate.update("INSERT INTO t_user(username,password) VALUES (?,?);", "tom", "998");
    }
}
