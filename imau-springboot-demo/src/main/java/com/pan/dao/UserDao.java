package com.pan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pan.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<UserPojo> {

}
