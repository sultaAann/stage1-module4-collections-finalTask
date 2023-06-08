package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Queue<String> res = new ArrayDeque<>();
        for (Map.Entry<String, Set<String>> el: projects.entrySet()) {
            if (el.getValue().contains(developer)) {
                res.add(el.getKey());
            }
        }
        List<String> rs = new ArrayList<>(res);
        Collections.reverse(rs);
        return rs;
    }
}
