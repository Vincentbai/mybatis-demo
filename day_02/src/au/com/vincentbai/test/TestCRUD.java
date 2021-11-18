package au.com.vincentbai.test;

import au.com.vincentbai.bean.Emp;
import au.com.vincentbai.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestCRUD {

    @Test
    public void testCRUD() throws IOException {

        // 准备工作
        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true); // 设置为true，自动提交事务
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

        // 测试：根据员工eid来获取信息
        Emp emp = empMapper.getEmpByEid("3");
        System.out.println("test1 -> " + emp);

        // 测试：获取所有的员工信息
        List<Emp> empList = empMapper.getAllEmps();
        System.out.println("test2 -> " + empList);

        // 测试：添加员工信息
//        empMapper.addEmp(new Emp(null, "admin", 23, "female"));

        // 测试：修改员工信息
//        empMapper.updateEmp(new Emp(6, "Sanfeng", 33, "male"));

        // 测试：删除员工
        empMapper.delEmp("7");

    }

}
