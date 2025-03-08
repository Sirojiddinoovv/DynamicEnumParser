package uz.nodir.enumdemo.util;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import uz.nodir.enumdemo.service.Platform;

import java.io.IOException;

/**
 * @author: PC
 * @date: 08.03.2025
 * @group: DavrCoders
 **/
public class PlatformDeserializer extends StdDeserializer<Platform> {
    protected PlatformDeserializer() {
        super(Platform.class);
    }

    @Override
    public Platform deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        return Platform.of(p.getValueAsString());
    }
}
