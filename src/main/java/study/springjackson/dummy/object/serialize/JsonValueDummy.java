package study.springjackson.dummy.object.serialize;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;

public class JsonValueDummy {

    public String id = "id1";
    public Person person = new Person();

    public class Person {
        public String name = "name2";
        public int age = 30;
    }

    @JsonValue
    public HashMap<String, String> jsonResult() {
        HashMap<String, String> result = new HashMap<>();
        result.put("id", id);
        result.put("name", person.name);
        return result;
    }

}
