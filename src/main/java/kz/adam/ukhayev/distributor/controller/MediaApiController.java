package kz.adam.ukhayev.distributor.controller;

import io.swagger.annotations.ApiOperation;
import kz.adam.ukhayev.distributor.service.MediaApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
@RequiredArgsConstructor
@ApiOperation(value = "Media")
public class MediaApiController {

    private final MediaApiService mediaApiService;

    @GetMapping
    public ResponseEntity<Page<?>> getAllMediaByEmail() {
        return null;
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveMediaByEmail() {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteMediaByEmail() {
        return ResponseEntity.ok().build();
    }
}
