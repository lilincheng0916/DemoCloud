package com.example.demo.entity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Demo class
 *
 * @author llc
 * @date 2019/2/12
 */
//通过ConfigurationProperties注解，将属性注入到bean中
@ConfigurationProperties(prefix="girl")
//通过component注解将bean注入到spring容器
@Component
public class AppMessage implements Serializable {
    private String id;

    private String message;

    private Date senddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }
}
