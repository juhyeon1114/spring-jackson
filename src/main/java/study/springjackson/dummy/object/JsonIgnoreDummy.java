package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JsonIgnoreDummy {

    @JsonIgnore
    public String key1 = "value1";
    public String key2 = "value2";
    @JsonIgnore
    public String key3 = "value3";

}
