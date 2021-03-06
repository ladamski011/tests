package tests.jackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.google.common.collect.Maps;

import java.util.Map;

public class BeanWithMap {
    private final String name;
    private final Map<String, String> map = Maps.newHashMap();

    public BeanWithMap(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    public Map<String, String> getMap() {
        return map;
    }
}
