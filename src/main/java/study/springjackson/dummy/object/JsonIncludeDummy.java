package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;

@JsonInclude(Include.NON_EMPTY)
@AllArgsConstructor
public class JsonIncludeDummy {

    public String key1;
    public String key2;
    public String key3;

}
