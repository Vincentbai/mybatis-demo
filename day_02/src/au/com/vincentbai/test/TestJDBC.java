package au.com.vincentbai.test;

import au.com.vincentbai.bean.Emp;

import java.sql.*;

public class TestJDBC {

    public static void main(String[] args) throws Exception{

        // #{} 方式 获取参数
        Class.forName(" ");
        Connection connection = DriverManager.getConnection("url", "username", "password");
        // 通配符的地方可以自己添加单引号，所以不用自己加
        PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(null, ?, ?, ?)", 1);
        preparedStatement.setString(1, "admin");
        preparedStatement.setString(2,"23");
        preparedStatement.setString(3, "Male");
        preparedStatement.executeUpdate();

        // 获取自动生成id
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        resultSet.next();
        int id = resultSet.getInt(1);

        // ${} 方式 获取参数
        Statement statement = connection.createStatement();
        Emp emp = new Emp(null, "a", 1, "b");
        // 如果拼接的是字符串就要加单引号，比如说getEname()和getGender()两边，为什么？因为sql语法问题
        // 标准的sql语法，字符串两边需要添加单引号。INSERT INTO Customers (CustomerName, City, Country) VALUES ('Cardinal', 'Stavanger', 'Norway');
        statement.execute("insert into emp values(null, '"+ emp.getEname() +"', "+ emp.getAge() +", '"+ emp.getGender() +"')");

    }
}
