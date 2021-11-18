package au.com.vincentbai.mapper;

import au.com.vincentbai.bean.Emp;
import org.apache.ibatis.annotations.MapKey;

import java.util.Map;

public interface EmpSelectMapper {

    // 根据eid获取一个员工信息
    Emp getEmpByEid(String eid);

    // 获取所有员工数量
    Integer getCount();

    // 以map集合获取一个员工信息
    Map<String, Object> getEmpMapByEid(String eid);

    // 以map集合获取所有员工信息
    @MapKey("eid") // 设置map的键，对应的所有信息是值
    Map<String, Object> getAllEmpMap();
}
