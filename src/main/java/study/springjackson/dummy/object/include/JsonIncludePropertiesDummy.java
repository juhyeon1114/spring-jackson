package study.springjackson.dummy.object.include;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.AllArgsConstructor;

@JsonIncludeProperties({ "key1", "key2" })
@AllArgsConstructor
public class JsonIncludePropertiesDummy {

    public String key1;
    public String key2;
    public String key3;

}
