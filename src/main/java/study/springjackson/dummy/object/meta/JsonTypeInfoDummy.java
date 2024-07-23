package study.springjackson.dummy.object.meta;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class JsonTypeInfoDummy {

    public Music music = new HipHop();
    public Music music2 = new Pop();

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "type"
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = HipHop.class, name = "hiphop"),
            @JsonSubTypes.Type(value = Pop.class, name = "pop")
    })
    public static class Music {
        public String title;
    }

//    @JsonTypeName("hiphop") // JsonSubTypes.Type의 name과 동일한 역할
    public static class HipHop extends Music{
        public String title = "HipHop dummy";
    }

//    @JsonTypeName("pop") // JsonSubTypes.Type의 name과 동일한 역할
    public static class Pop extends Music {
        public String title = "Pop dummy";
        public String comment = "Pop comment";
    }

}
