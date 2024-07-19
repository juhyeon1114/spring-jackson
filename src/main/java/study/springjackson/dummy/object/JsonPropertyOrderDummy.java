package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;

@Getter
@JsonPropertyOrder({"field3", "field1", "field2"})
public class JsonPropertyOrderDummy {

    private String field1 = "one";
    private String field2 = "two";
    private String field3 = "three";

}
