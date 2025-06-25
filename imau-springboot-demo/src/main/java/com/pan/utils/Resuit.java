package com.pan.utils;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;


import java.util.HashMap;
import java.util.Map;

public class Resuit {


    public static String okGetString(String message) {
        Map<String, String> map = new HashMap<>();
        map.put("code", "200");
        map.put("msg", message);
        return JSONObject.toJSONString(map);
    }

    public static String okGetStringByData(String message, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "200");
        map.put("msg", message);
        map.put("data", data);
        return JSONObject.toJSONString(map);
    }

}
