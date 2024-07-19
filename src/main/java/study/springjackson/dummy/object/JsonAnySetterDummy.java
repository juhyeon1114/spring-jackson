package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.HashMap;

public class JsonAnySetterDummy {

    public HashMap<String, String> anyProperties = new HashMap<>();

    @JsonAnySetter
    public void addAnyProperties(String key, String value) {
        anyProperties.put(key, value);
    }

}
