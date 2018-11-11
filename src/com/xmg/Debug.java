package com.xmg;

import java.util.HashMap;
import java.util.Map;

public class Debug {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
        Map<String,Integer> map = new HashMap<>();
        map.put("乔峰",1);
        map.put("虚竹",2);
        map.put("段誉",3);
        System.out.println(map);
    }
}
