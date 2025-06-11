package com.springcore.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String,Integer> mp;
    private Properties properties;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getMp() {
        return mp;
    }

    public void setMp(Map<String, Integer> mp) {
        this.mp = mp;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", mp=" + mp +
                ", properties=" + properties +
                '}';
    }
}
