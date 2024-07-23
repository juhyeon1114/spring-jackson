package study.springjackson.dummy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springjackson.dummy.object.get.JsonFormatDummy;
import study.springjackson.dummy.object.get.JsonPropertyDummy;
import study.springjackson.dummy.object.get.JsonUnwrappedDummy;
import study.springjackson.dummy.object.include.JsonIncludeDummy;
import study.springjackson.dummy.object.include.JsonIncludePropertiesDummy;
import study.springjackson.dummy.object.meta.JsonTypeInfoDummy;
import study.springjackson.dummy.object.ref.Child;
import study.springjackson.dummy.object.ref.Parent;
import study.springjackson.dummy.object.ref.UnmanagedChild;
import study.springjackson.dummy.object.ref.UnmanagedParent;
import study.springjackson.dummy.object.serialize.JsonCreatorDummy;
import study.springjackson.dummy.object.serialize.JsonSerializeDummy;
import study.springjackson.dummy.object.serialize.JsonValueDummy;
import study.springjackson.dummy.object.set.JsonAliasDummy;
import study.springjackson.dummy.object.get.JsonAnyGetterDummy;
import study.springjackson.dummy.object.set.JsonAnySetterDummy;
import study.springjackson.dummy.object.get.JsonGetterDummy;
import study.springjackson.dummy.object.ignore.JsonIgnoreDummy;
import study.springjackson.dummy.object.ignore.JsonIgnorePropertiesDummy;
import study.springjackson.dummy.object.ignore.JsonIgnoreTypeDummy;
import study.springjackson.dummy.object.get.JsonPropertyOrderDummy;
import study.springjackson.dummy.object.get.JsonRawValueDummy;
import study.springjackson.dummy.object.get.JsonRootNameDummy;
import study.springjackson.dummy.object.set.JsonSetterDummy;

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

    @GetMapping("/JsonPropertyDummy")
    public JsonPropertyDummy JsonPropertyDummy() {
        return new JsonPropertyDummy();
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
        return new JsonValueDummy();
    }

    @GetMapping("/JsonFormatDummy")
    public JsonFormatDummy JsonFormatDummy() {
        return new JsonFormatDummy();
    }

    @GetMapping("/JsonRootNameDummy")
    public String JsonRootNameDummy() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        return mapper.writeValueAsString(new JsonRootNameDummy());
    }

    @GetMapping("/JsonUnwrappedDummy")
    public JsonUnwrappedDummy JsonUnwrappedDummy() {
        return new JsonUnwrappedDummy();
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

    @GetMapping("/JsonIgnorePropertiesDummy")
    public JsonIgnorePropertiesDummy JsonIgnorePropertiesDummy() {
        return new JsonIgnorePropertiesDummy();
    }

    @GetMapping("/JsonIgnoreDummy")
    public JsonIgnoreDummy JsonIgnoreDummy() {
        return new JsonIgnoreDummy();
    }

    @GetMapping("/JsonIgnoreTypeDummy")
    public JsonIgnoreTypeDummy JsonIgnoreTypeDummy() {
        return new JsonIgnoreTypeDummy();
    }

    @GetMapping("/JsonIncludeDummy")
    public JsonIncludeDummy JsonIncludeDummy() {
        return new JsonIncludeDummy("value1", null, " ");
    }

    @GetMapping("/JsonIncludePropertiesDummy")
    public JsonIncludePropertiesDummy JsonIncludePropertiesDummy() {
        return new JsonIncludePropertiesDummy("value1", null, " ");
    }

    @GetMapping("/JsonTypeInfoDummy")
    public JsonTypeInfoDummy JsonTypeInfoDummy() {
        return new JsonTypeInfoDummy();
    }

    @GetMapping("/JsonSerializeDummy")
    public JsonSerializeDummy JsonSerializeDummy() {
        return new JsonSerializeDummy("Title1", "Title2");
    }

    @GetMapping("/JsonDeserializerDummy")
    public String JsonDeserializerDummy() throws JsonProcessingException {
        String json = "{\"title1\":\"    Title1          \", \"title2\":\"    Title2          \"}";

        JsonSerializeDummy dummy = new ObjectMapper()
                .readerFor(JsonSerializeDummy.class)
                .readValue(json);
        return dummy.getTitle1() + "," + dummy.getTitle2();
    }

    @GetMapping("/JsonCreatorDummy")
    public String JsonCreatorDummy() throws JsonProcessingException {
        String json = "{\"t\":\"제목이요\",\"c\":\"내용이요\"}";
        JsonCreatorDummy dummy = new ObjectMapper()
                .readerFor(JsonCreatorDummy.class)
                .readValue(json);

        return dummy.getTitle() + " " + dummy.getContent();
    }

    @GetMapping("/Reference/managed")
    public Parent managed() {
        Parent parent = new Parent("parent1");
        parent.addChild(new Child("child1"));
        parent.addChild(new Child("child2"));
        return parent;
    }

    @GetMapping("/Reference/unmanaged")
    public UnmanagedParent unmanaged() {
        UnmanagedParent parent = new UnmanagedParent("parent1");
        parent.addChild(new UnmanagedChild("child1"));
        parent.addChild(new UnmanagedChild("child2"));
        return parent;
    }

}
