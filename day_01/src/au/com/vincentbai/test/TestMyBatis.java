package au.com.vincentbai.test;

import au.com.vincentbai.bean.User;
import au.com.vincentbai.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis {

    @Test
    public void test() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 会根据动态代理来动态生成UserMapper的实现，面向接口编程
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(userMapper.getClass().getName());

        User user = userMapper.getUserByUid("1");

        System.out.println(user);

    }

}
