package com.pro.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pro.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User>{
}
