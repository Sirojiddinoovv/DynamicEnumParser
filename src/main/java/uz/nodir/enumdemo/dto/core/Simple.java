package uz.nodir.enumdemo.dto.core;


import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Value;
import uz.nodir.enumdemo.service.Platform;

/**
 * @author: PC
 * @date: 08.03.2025
 * @group: DavrCoders
 **/

@Value
public class Simple implements Platform {
    String value;

    @Override
    @JsonValue
    public String value() {
        return value;
    }
}
