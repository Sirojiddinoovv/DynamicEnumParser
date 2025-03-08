package uz.nodir.enumdemo.enums;


import com.fasterxml.jackson.annotation.JsonValue;
import lombok.extern.slf4j.Slf4j;
import uz.nodir.enumdemo.service.Platform;

/**
 * @author: PC
 * @date: 08.03.2025
 * @group: DavrCoders
 **/

@Slf4j
public enum PlatformType implements Platform {
    WEB, MOBILE;

    public static PlatformType parse(String rawValue) {
        if (rawValue == null) {
            log.warn("rawValue is null");
            throw new IllegalArgumentException("Raw value cannot be null");
        }
        var trimmed = rawValue.toUpperCase().trim();
        for (var platformType : values()) {
            if (platformType.name().equals(trimmed)) {
                log.info("Found Enum with value: {}", rawValue);
                return platformType;
            }
        }

        log.warn("unknown enum value: {}", rawValue);
        throw new IllegalArgumentException("Cannot parse enum from raw value: " + rawValue);
    }

    @Override
    @JsonValue
    public String value() {
        return name();
    }
}
