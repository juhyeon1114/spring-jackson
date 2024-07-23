package study.springjackson.dummy.object.serialize;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class JsonCreatorDummy {

    private String title;
    private String content;

    @JsonCreator
    public JsonCreatorDummy(
            @JsonProperty("t") String title,
            @JsonProperty("c") String content
    ) {
        this.title = title;
        this.content = content;
    }

}
