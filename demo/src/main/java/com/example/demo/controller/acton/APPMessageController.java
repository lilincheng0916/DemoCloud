package com.example.demo.controller.acton;

import java.util.List;

import com.example.demo.entity.AppMessage;
import com.example.demo.service.AppMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/test")
public class APPMessageController {

    @Autowired
    private AppMessageService service;



//    @RequestMapping("/getThree")
//    public List<AppMessage> getThreeForMessage(){
//
//        List<AppMessage> list = service.getMessage();
//        return list;
//    }

    @RequestMapping("/getAll")
    public List<AppMessage> getAllMessage(){

        List<AppMessage> list = service.getAllMessage();
//        int num = list.size();
//        if(null!=list && num>3){
//            for (int i = 0; i < num-3; i++) {
//                list.remove(0);
//            }
    //    }
        return list;
    }

    @GetMapping("getHelloWorld")
    public String getHelloWorld(HttpServletRequest request){
        //获取IP地址
        String ipAddress =IpUtil.getIpAddr(request);
        AppMessage app=new AppMessage();
        app.setId("1");
        app.setMessage("你好");
        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("id",1);
            jsonObject.put("name","离开");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return  jsonObject.toString();
    }

//    @RequestMapping("/getByID")
//    public List<AppMessage> getMessageById(@RequestParam("id") String id){
//        List<AppMessage> list = service.getMessageById(id);
//        int num = list.size();
//        if(null!=list && num>5){
//            for (int i = 0; i < num-5; i++) {
//                list.remove(0);
//            }
//        }
//        return list;
//    }
//
//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    public int addMessage(@RequestBody AppMessage appMessage){
//        return service.addMessage(appMessage);
//    }
//
//    @RequestMapping(value="/delMessageById",method=RequestMethod.POST)
//    public int delMessageById(@RequestParam("id") String id){
//        return service.delMessage(id);
//    }
}

