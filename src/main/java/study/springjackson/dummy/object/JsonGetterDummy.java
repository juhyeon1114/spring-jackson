package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonGetter;

public class JsonGetterDummy {

    private String field = "Hello world";

    @JsonGetter("JSON_GETTER")
    public String getField() {
        return field;
    }

}
