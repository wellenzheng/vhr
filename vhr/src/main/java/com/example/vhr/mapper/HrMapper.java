package com.example.vhr.mapper;

import com.example.vhr.model.Hr;
import com.example.vhr.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadHrByUsername(String username);

    List<Role> getHrRolesById(Integer id);
}