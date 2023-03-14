package com.thortful.apichallenge.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PexelsPhotosModel {

    @JsonProperty("id")
    private long id;

    @JsonProperty("width")
    private int width;

    @JsonProperty("height")
    private int height;

    @JsonProperty("url")
    private String url;

    @JsonProperty("photographer")
    private String photographer;

    @JsonProperty("photographer_url")
    private String photographerUrl;

    @JsonProperty("photographer_id")
    private long photographerId;

    @JsonProperty("avg_color")
    private String avgColor;

    @JsonProperty("src")
    private PexelsSourceModel src;

    @JsonProperty("liked")
    private boolean liked;

    @JsonProperty("alt")
    private String alt;
}
