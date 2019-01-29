package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.AppMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AppMessageMapper {

    List<AppMessage> findAll();

}
