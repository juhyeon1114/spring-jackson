package study.springjackson.dummy.object.get;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "root-key")
public class JsonRootNameDummy {

    public String key1 = "value1";
    public String key2 = "value2";

}
