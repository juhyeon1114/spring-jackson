package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonAlias;

public class JsonAliasDummy {

    @JsonAlias({"k1"})
    public String key1;
    public String key2;
    public String key3;

}
