package com.ltp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/26 23:38
 */
public class WebsiteFactory {

    /**
     * 缓存池
     */
    private Map<String, AbstractWebsite> pool = new HashMap<>(16);

    public AbstractWebsite getWebsite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConCreateWebsite(type));
        }
        return pool.get(type);
    }

    public int getCount() {
        return pool.size();
    }
}
