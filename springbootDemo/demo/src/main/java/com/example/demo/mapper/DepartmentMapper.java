package com.example.demo.mapper;

import com.example.demo.bean.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by zsq on 2018/3/22.
 */
@Mapper
public interface DepartmentMapper {

    public void insert(Department department);

    public Department getById(Integer id);

    public void update(Department department);

    public void deleteById(Integer id);
}
