package com.thortful.apichallenge.controller;

import com.thortful.apichallenge.client.PexelsClient;
import com.thortful.apichallenge.client.model.PexelsModel;
import com.thortful.apichallenge.client.model.PexelsPhotosModel;
import com.thortful.apichallenge.exception.ThortfulException;
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
        try {
            return pexelsClient.searchPhotosByTopic(subject);
        } catch (Exception e) {
            throw new ThortfulException(e.getMessage());
        }
    }

    @GetMapping(value = "/trending", produces = APPLICATION_JSON_VALUE)
    public PexelsModel getTrendingPhotos() {
        try {
            return pexelsClient.retrieveTrendingPhotos();
        } catch (Exception e) {
            throw new ThortfulException(e.getMessage());
        }
    }

    @GetMapping(value = "/photos/{id}", produces = APPLICATION_JSON_VALUE)
    public PexelsPhotosModel getPhoto(@PathVariable String id) {
        try {
            return pexelsClient.retrievePhotoById(id);
        } catch (Exception e) {
            throw new ThortfulException(e.getMessage());
        }
    }
}
