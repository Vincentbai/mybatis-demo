package au.com.vincentbai.mapper;

import au.com.vincentbai.bean.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface ParamMapper {

    void insertEmp(Emp emp);

    Emp getEmpByEid(String eid);

    Emp getEmpByEidAndEname(String eid, String ename);

    Emp getEmpByMap(Map<String,Object> map);

    Emp getEmpByEidAndEnameByParam(@Param("eid") String eid, @Param("ename") String ename);

}
