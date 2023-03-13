package com.thortful.apichallenge.client;

import com.thortful.apichallenge.client.model.PexelsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class PexelsClientImpl implements PexelsClient {

    private final RestTemplate restTemplate;

    @Value("${pexels.api-key}")
    private String apiKey;

    @Value("${pexels.base-url}")
    private String baseUrl;

    @Value("${pexels.endpoint.photos}")
    private String photosEndpoint;

    @Value("${pexels.endpoint.search}")
    private String searchEndpoint;

    @Value("${pexels.endpoint.trending}")
    private String trendingEndpoint;

    @Autowired
    public PexelsClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public PexelsModel searchPhotosByTopic(String topic) {
        final URI uri = UriComponentsBuilder.fromUriString(baseUrl)
                .pathSegment(searchEndpoint)
                .queryParam("query", topic)
                .build()
                .toUri();

        HttpEntity<PexelsModel> requestEntity = new HttpEntity<>(createHttpHeaders());
        return restTemplate.exchange(uri, HttpMethod.GET, requestEntity, PexelsModel.class)
                .getBody();
    }

    @Override
    public PexelsModel retrieveTrendingPhotos() {
        return null;
    }

    @Override
    public PexelsModel retrievePhotoById(long id) {
        return null;
    }

    private HttpHeaders createHttpHeaders() {
        return new HttpHeaders() {{
            set("Authorization", apiKey);
        }};
    }
}
