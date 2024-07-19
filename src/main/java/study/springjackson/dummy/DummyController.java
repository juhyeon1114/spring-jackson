package study.springjackson.dummy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springjackson.dummy.object.JsonAnyGetterDummy;
import study.springjackson.dummy.object.JsonGetterDummy;
import study.springjackson.dummy.object.JsonPropertyOrderDummy;
import study.springjackson.dummy.object.JsonRawValueDummy;

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

}
