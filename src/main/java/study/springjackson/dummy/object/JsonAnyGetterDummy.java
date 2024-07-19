package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import java.util.Map;

public class JsonAnyGetterDummy {

    @JsonAnyGetter
    private Map<String, String> field = Map.of("key1", "value1", "key2", "value2");

}
