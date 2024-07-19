package study.springjackson.dummy.object.set;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * json으로 값을 주입할 때는 Key값을 k1, k2만 사용할 수 있음.
 * 그 외에 Key값을 사용하면, 예외 발생
 */
public class JsonSetterDummy {

    public String key1;
    public String key2;

    @JsonSetter("k1")
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    @JsonSetter("k2")
    public void setKey2(String key2) {
        this.key2 = key2;
    }

}
