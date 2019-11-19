package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.AppMessage;
import org.springframework.stereotype.Repository;

@Repository
public interface AppMessageMapper {

    List<AppMessage> findAll();

}
