package com.thortful.apichallenge.controller;

import com.thortful.apichallenge.client.PexelsClient;
import com.thortful.apichallenge.client.model.PexelsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("thortful")
public class ThortfulController {

    private final PexelsClient pexelsClient;


    public ThortfulController(PexelsClient pexelsClient) {
        this.pexelsClient = pexelsClient;
    }

    @GetMapping(value = "/topic/{subject}", produces = APPLICATION_JSON_VALUE)
    public PexelsModel getPhotosByTopic(@PathVariable String subject) {
        return pexelsClient.searchPhotosByTopic(subject);
    }

}
