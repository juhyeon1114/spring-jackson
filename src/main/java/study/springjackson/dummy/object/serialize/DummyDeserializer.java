package study.springjackson.dummy.object.serialize;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class DummyDeserializer extends StdDeserializer<String> {

    public DummyDeserializer() {
        this(null);
    }

    public DummyDeserializer(Class<String> t) {
        super(t);
    }

    @Override
    public String deserialize(JsonParser parser, DeserializationContext context) throws IOException, JacksonException {
        return parser.getText().strip();
    }

}