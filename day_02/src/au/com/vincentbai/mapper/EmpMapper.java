package au.com.vincentbai.mapper;

import au.com.vincentbai.bean.Emp;

import java.util.List;

public interface EmpMapper {

    // 根据eid查询一个信息
    Emp getEmpByEid(String eid);

    // 获取所有的员工信息
    List<Emp> getAllEmps();

    // 添加员工信息
    void addEmp(Emp emp);

    // 修改员工信息
    void updateEmp(Emp emp);

    // 删除员工信息
    void delEmp(String eid);


}
