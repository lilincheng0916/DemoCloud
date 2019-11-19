package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.AppMessage;
import com.example.demo.mapper.AppMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AppMessageService {

    @Autowired(required=true)
    private AppMessageMapper mapper;

//    public List<AppMessage> getMessage(){
//        List<AppMessage> list = new ArrayList<AppMessage>();
//        list.add(mapper.selectByPrimaryKey("1"));
//        list = mapper.findAll();
//        return list;
//    }

    public List<AppMessage> getAllMessage(){
        List<AppMessage> list = new ArrayList<AppMessage>();
        list = mapper.findAll();
        return list;
    }

//    public int addMessage(AppMessage appMessage) {
//        return mapper.insert(appMessage);
//    }
//
//    public List<AppMessage> getMessageById(String id) {
//        return mapper.getMessById(id);
//    }
//
//    public int delMessage(String id) {
//        return mapper.deleteByPrimaryKey(id);
//    }
//

    public int deleteByPrimaryKey(){
        return  1;
    }

}

