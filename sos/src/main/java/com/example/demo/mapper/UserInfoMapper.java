package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.UserInfo;

@Mapper
public interface UserInfoMapper {
	
		@Select("SELECT * FROM UserInfo WHERE id=#{id}")
		UserInfo getUserInfo(@Param("id") String id);
		
		@Select("SELECT * FROM UserInfo")
		List<UserInfo> getUserInfoList();
		
		@Insert("INSERT INTO UserInfo VALUES(#{id}, #{age}, #{income_grade}, #{total_fare})")
		int insertUserInfo(@Param("id") String id, @Param("age") int age, @Param("income_grade") int income_grade, @Param("total_fare") int total_fare);
		
		@Update("UPDATE UserInfo SET age=#{age}, income_grade=#{income_grade}, total_fare=#{total_fare} WHERE id=#{id}")
		int updateUserInfo(@Param("id") String id, @Param("age") int age, @Param("income_grade") int income_grade, @Param("total_fare") int total_fare);
			
		@Delete("DELETE FROM UserInfo WHERE id=#{id}")
		int deleteUserInfo(@Param("id") String id);

}
