package kz.adam.ukhayev.distributor.controller;

import io.swagger.annotations.ApiOperation;
import kz.adam.ukhayev.distributor.service.MessengerApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messenger")
@RequiredArgsConstructor
@ApiOperation(value = "Message")
public class MessengerApiController {

    private final MessengerApiService messengerApiService;

}
