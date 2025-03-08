package uz.nodir.enumdemo.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import uz.nodir.enumdemo.dto.message.request.MessageRequestDTO;
import uz.nodir.enumdemo.dto.message.response.MessageResponseDTO;

/**
 * @author: PC
 * @date: 08.03.2025
 * @group: DavrCoders
 **/

@Component
@Slf4j
public class MessageService {

    public MessageResponseDTO handleMessage(MessageRequestDTO requestDTO) {
        log.info("Received command to handle message with request dto: {}", requestDTO);

        var response = new MessageResponseDTO(requestDTO.getPlatform());

        log.info("Finished command to handle message with response dto: {}", response);
        return response;
    }
}
