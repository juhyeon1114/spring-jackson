package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"key1", "key3"})
public class JsonIgnorePropertiesDummy {

    public String key1 = "value1";
    public String key2 = "value2";
    public String key3 = "value3";

}
