package com.qf.utils;

import com.qf.pojo.Detail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONUtil {

    public static Map<String,Object> getSuccess(int msgCode,List list,int pages){
        Map<String,Object> result = new HashMap<>();
        Map<String,Object> data = new HashMap<>();
        result.put("msgCode",msgCode);
        data.put("list",list);
        data.put("pages",pages);
        result.put("data",data);
        return result;
    }

    public static Map<String,Object> getStatus(int msgCode){
        Map<String,Object> result = new HashMap<>();
        result.put("msgCode",msgCode);
        return result;
    }

    public static Map<String,Object> getStatusAndObj(int msgCode,Detail detail){
        Map<String,Object> result = new HashMap<>();
        Map<String,Object> data = new HashMap<>();
        result.put("msgCode",msgCode);
        data.put("detail",detail);
        result.put("data",data);
        return result;
    }

    public static Map<String,Object> getSuccessLogin(int msgCode,int userId){
        Map<String,Object> result = new HashMap<>();
        Map<String,Object> data = new HashMap<>();
        result.put("msgCode",msgCode);
        data.put("userId",userId);
        result.put("data",data);
        return result;
    }
}
