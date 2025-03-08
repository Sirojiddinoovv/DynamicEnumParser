package uz.nodir.enumdemo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.nodir.enumdemo.dto.message.request.MessageRequestDTO;
import uz.nodir.enumdemo.dto.message.response.MessageResponseDTO;
import uz.nodir.enumdemo.service.MessageService;

/**
 * @author: PC
 * @date: 02.03.2025
 * @group: DavrCoders
 **/

@RestController
@RequestMapping("/api/v1/message")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<MessageResponseDTO> send(@RequestBody MessageRequestDTO requestDTO) {
        return ResponseEntity.ok(
                messageService.handleMessage(requestDTO)
        );
    }
}
