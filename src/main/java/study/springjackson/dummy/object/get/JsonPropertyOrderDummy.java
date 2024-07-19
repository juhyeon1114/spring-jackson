package study.springjackson.dummy.object.get;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"field3", "field1", "field2"})
public class JsonPropertyOrderDummy {

    public String field1 = "one";
    public String field2 = "two";
    public String field3 = "three";

}
