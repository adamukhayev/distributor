package kz.adam.ukhayev.distributor.controller;

import kz.adam.ukhayev.distributor.model.dto.message.MessageDto;
import kz.adam.ukhayev.distributor.service.MessengerApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messenger")
@RequiredArgsConstructor
public class MessengerApiController {

    private final MessengerApiService messengerApiService;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody MessageDto messageDto,
            @RequestParam String jwtToken) {
        messengerApiService.sendMessage(messageDto, jwtToken);
        return ResponseEntity.ok().build();
    }
}
