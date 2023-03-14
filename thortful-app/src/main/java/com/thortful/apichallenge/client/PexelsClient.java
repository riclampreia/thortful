package com.thortful.apichallenge.client;

import com.thortful.apichallenge.client.model.PexelsModel;
import com.thortful.apichallenge.client.model.PexelsPhotosModel;
import org.springframework.stereotype.Component;

@Component
public interface PexelsClient {

    PexelsModel searchPhotosByTopic(String topic);

    PexelsModel retrieveTrendingPhotos();

    PexelsPhotosModel retrievePhotoById(String id);
}