package study.springjackson.dummy.object.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class DummySerializer extends StdSerializer<String> {

    public DummySerializer() {
        this(null);
    }

    public DummySerializer(Class<String> t) {
        super(t);
    }

    @Override
    public void serialize(String s, JsonGenerator generator, SerializerProvider provider) throws IOException {
        generator.writeString("제목: " + s);
    }

}