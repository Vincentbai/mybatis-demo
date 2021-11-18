package au.com.vincentbai.test;

import au.com.vincentbai.bean.Emp;
import au.com.vincentbai.mapper.EmpSelectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class TestSelect {

    @Test
    public void testSelect() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        SqlSessionFactory sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactoryBuilder.openSession(true);

        EmpSelectMapper empSelectMapper = sqlSession.getMapper(EmpSelectMapper.class);

        Emp emp = empSelectMapper.getEmpByEid("1");
        System.out.println("getEmpByEid -> " + emp);

        Integer count = empSelectMapper.getCount();
        System.out.println("getCount -> " + count);

        Map<String, Object> empMap = empSelectMapper.getEmpMapByEid("1");
        System.out.println("getEmpMapByEid -> " + empMap);

        Map<String, Object> allEmpMap = empSelectMapper.getAllEmpMap();
        System.out.println("getAllEmpMap -> " + allEmpMap);


    }

}
