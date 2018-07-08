package com.example.demo.dao;

import com.example.demo.entity.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface  UserDao extends JpaRepository<UserVo,Integer> {


    @Query(value = "SELECT `password` FROM user_vo WHERE user_name='admin'",nativeQuery = true)
   String findPasswd();

}
