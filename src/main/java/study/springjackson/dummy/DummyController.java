package study.springjackson.dummy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springjackson.dummy.object.JsonAliasDummy;
import study.springjackson.dummy.object.JsonAnyGetterDummy;
import study.springjackson.dummy.object.JsonAnySetterDummy;
import study.springjackson.dummy.object.JsonGetterDummy;
import study.springjackson.dummy.object.JsonPropertyOrderDummy;
import study.springjackson.dummy.object.JsonRawValueDummy;
import study.springjackson.dummy.object.JsonRootNameDummy;
import study.springjackson.dummy.object.JsonSetterDummy;
import study.springjackson.dummy.object.JsonValueDummy;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @GetMapping("/JsonAnyGetterDummy")
    public JsonAnyGetterDummy JsonAnyGetterDummy() {
        return new JsonAnyGetterDummy();
    }

    @GetMapping("/JsonGetterDummy")
    public JsonGetterDummy JsonGetterDummy() {
        return new JsonGetterDummy();
    }

    @GetMapping("/JsonPropertyOrderDummy")
    public JsonPropertyOrderDummy JsonPropertyOrderDummy() {
        return new JsonPropertyOrderDummy();
    }

    @GetMapping("/JsonRawValueDummy")
    public JsonRawValueDummy JsonRawValueDummy() {
        return new JsonRawValueDummy();
    }

    @GetMapping("/JsonValueDummy")
    public JsonValueDummy JsonValueDummy() {
        // todo
        return new JsonValueDummy();
    }

    @GetMapping("/JsonRootNameDummy")
    public String JsonRootNameDummy() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        return mapper.writeValueAsString(new JsonRootNameDummy());
    }

    @GetMapping("/JsonAnySetterDummy")
    public JsonAnySetterDummy JsonAnySetterDummy() throws JsonProcessingException {
        String json = "{\"key1\":\"value1\",\"key2\":\"value2\",\"key3\":\"value3\"}";

        return new ObjectMapper()
                .readerFor(JsonAnySetterDummy.class)
                .readValue(json);
    }

    @GetMapping("/JsonSetterDummy")
    public JsonSetterDummy JsonSetterDummy() throws JsonProcessingException {
        String json = "{\"k1\":\"value1\",\"k2\":\"value2\",\"k1\":\"value3\"}";

        return new ObjectMapper()
                .readerFor(JsonSetterDummy.class)
                .readValue(json);
    }

    @GetMapping("/JsonAliasDummy")
    public JsonAliasDummy JsonAliasDummy() throws JsonProcessingException {
        String json = "{\"k1\":\"value1\",\"key2\":\"value2\",\"key3\":\"value3\"}";

        return new ObjectMapper()
                .readerFor(JsonAliasDummy.class)
                .readValue(json);
    }

    /**
     * todo
     *
     * -- Serialize / Deserialize
     * JsonSerialize
     * JsonCreator
     * JsonDeserialize
     *
     * JsonIgnoreProperties
     * JsonIgnore
     * JsonIgnoreType
     * JsonInclude
     * JsonIncludeProperties
     * JsonAutoDetect
     *
     * JsonTypeInfo
     * JsonSubTypes
     * JsonTypeName
     *
     * JsonProperty
     * JsonFormat
     * JsonUnwrapped
     * JsonView
     * JsonManagedReference
     * JsonBackReference
     * JsonIdentityInfo
     * JsonFilter
     */

}
