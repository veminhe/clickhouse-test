package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entity.UserInfo;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    void saveData (UserInfo userInfo) ;
    UserInfo selectById (@Param("id") Integer id) ;
    List<UserInfo> selectList () ;
}
