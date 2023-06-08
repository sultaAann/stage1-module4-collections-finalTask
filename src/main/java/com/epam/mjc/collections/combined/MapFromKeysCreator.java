package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();
        for (Map.Entry<String, Integer> el: sourceMap.entrySet()) {
            int indexOfRes = el.getKey().length();
            if (!(res.containsKey(indexOfRes))) {
                res.put(indexOfRes, new HashSet<>() {{
                    add(el.getKey());
                }});
            } else if (res.containsKey(indexOfRes) && !(res.containsValue(el.getKey()))) {
                Set<String> a = res.get(indexOfRes);
                a.add(el.getKey());
                res.put(indexOfRes, a);
                }
            }
        return res;
        }
    }