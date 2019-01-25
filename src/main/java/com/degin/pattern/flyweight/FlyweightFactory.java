package com.degin.pattern.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap();

    public static Flyweight getFlyweight(String poolKey) {
        Flyweight flyweight = null;
        if (pool.containsKey(poolKey)) {
            flyweight = pool.get(poolKey);
            System.out.println(poolKey + "已存在");
        } else {
            flyweight = new ConcreteFlyweight();
            System.out.println(poolKey + "新创建");
            pool.put(poolKey, flyweight);
        }
        return flyweight;
    }

}
