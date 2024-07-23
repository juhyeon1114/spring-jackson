package study.springjackson.dummy.object.serialize;

import com.fasterxml.jackson.annotation.JsonValue;

public class JsonValueDummy {

    public String id = "id1";
    @JsonValue
    public Person person = new Person();

    public class Person {
        public String name = "name2";
        public int age = 30;
    }

}
