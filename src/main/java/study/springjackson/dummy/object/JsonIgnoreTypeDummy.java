package study.springjackson.dummy.object;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class JsonIgnoreTypeDummy {

    public IWantToBeIgnored key1 = new IWantToBeIgnored();
    public String key2 = "value2";

    @JsonIgnoreType
    public class IWantToBeIgnored {
        public String ignore1 = "ignore1";
        public String ignore2 = "ignore2";
    }

}
