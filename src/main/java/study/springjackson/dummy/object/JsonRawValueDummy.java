package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonRawValueDummy {

    @JsonRawValue
    public String field = "{\"key\":\"value\", \"key2\":\"value2\"}";

}
