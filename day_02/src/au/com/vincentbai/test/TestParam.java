package au.com.vincentbai.test;

import au.com.vincentbai.bean.Emp;
import au.com.vincentbai.mapper.ParamMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestParam {

    @Test
    public void testParam() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true); // 设置为true，自动提交事务

        ParamMapper paramMapper = sqlSession.getMapper(ParamMapper.class);


//        Emp emp = new Emp(null, "testId", 23, "Female");
//        paramMapper.insertEmp(emp);

        // 第一种方式
//        Emp emp = paramMapper.getEmpByEid("1");
        //
//        Emp emp = paramMapper.getEmpByEidAndEname("1", "Vincent");

//        HashMap<String, Object> map = new HashMap<>();
//
//        map.put("eid", 1);
//        map.put("ename", "Vincent");
//        Emp emp = paramMapper.getEmpByMap(map);

        Emp emp = paramMapper.getEmpByEidAndEnameByParam("1", "Vincent");
        System.out.println(emp);

    }

}
