package uz.nodir.enumdemo.dto.message.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.nodir.enumdemo.service.Platform;
import uz.nodir.enumdemo.util.PlatformDeserializer;

/**
 * @author: PC
 * @date: 02.03.2025
 * @group: DavrCoders
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequestDTO {

    @JsonProperty("platform")
    @JsonDeserialize(using = PlatformDeserializer.class)
    private Platform platform;
}
