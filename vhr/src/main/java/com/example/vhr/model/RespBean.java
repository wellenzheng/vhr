package com.example.vhr.model;

/**
 * @author: WJZheng
 * @date: 2020/4/16 17:03
 * @description:
 */
public class RespBean {
    private Integer status;
    private String message;
    private Object object;

    public static RespBean ok(String message) {
        return new RespBean(200, message, null);
    }

    public static RespBean ok(String message, Object object) {
        return new RespBean(200, message, object);
    }

    public static RespBean error(String message) {
        return new RespBean(500, message, null);
    }

    public static RespBean error(String message, Object object) {
        return new RespBean(500, message, object);
    }

    private RespBean(){}

    private RespBean(Integer status, String message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
