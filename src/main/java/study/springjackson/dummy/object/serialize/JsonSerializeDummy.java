package study.springjackson.dummy.object.serialize;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JsonSerializeDummy {

    @JsonSerialize(using = DummySerializer.class)
    @JsonDeserialize(using = DummyDeserializer.class)
    public String title1;

    public String title2;

}
