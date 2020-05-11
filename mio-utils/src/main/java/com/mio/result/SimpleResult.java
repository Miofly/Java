package com.mio.result;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 */
public class SimpleResult {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private String status;

    // 响应消息
    private String message;

    // 响应中的数据
    private Object data;

    public static SimpleResult build(String status, String message, Object data) {
        return new SimpleResult(status, message, data);
    }

    public static SimpleResult ok(Object data) {
        return new SimpleResult(data);
    }

    public static SimpleResult ok() {
        return new SimpleResult(null);
    }

    public SimpleResult() {

    }

    public static SimpleResult build(String status, String message) {
        return new SimpleResult(status, message, null);
    }

    public SimpleResult(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public SimpleResult(Object data) {
        this.status = "1";
        this.message = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
/*
    *//**
     * 将json结果集转化为TaotaoResult对象
     * 
     * @param jsonData json数据
     * @param clazz TaotaoResult中的object类型
     * @return
     *//*
    public static SimpleResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, SimpleResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("message").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    *//**
     * 没有object对象的转化
     * 
     * @param json
     * @return
     *//*
    public static SimpleResult format(String json) {
        try {
            return MAPPER.readValue(json, SimpleResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    *//**
     * Object是集合转化
     * 
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     *//*
    public static SimpleResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("message").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }*/

}
