package study.springjackson.dummy.object.get;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import java.util.Map;

public class JsonAnyGetterDummy {

    @JsonAnyGetter
    public Map<String, String> field = Map.of("key1", "value1", "key2", "value2");

}
