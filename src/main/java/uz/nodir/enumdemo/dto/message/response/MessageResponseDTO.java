package uz.nodir.enumdemo.dto.message.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.nodir.enumdemo.service.Platform;

/**
 * @author: PC
 * @date: 08.03.2025
 * @group: DavrCoders
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponseDTO {

    @JsonProperty("platform")
    private Platform platform;
}
