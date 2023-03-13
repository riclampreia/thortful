package com.thortful.apichallenge.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PexelsPhotosModel {

    private long id;

    private int width;

    private int height;

    private String url;

    private String photographer;

    @JsonProperty("photographer_url")
    private String photographerUrl;

    @JsonProperty("photographer_id")
    private long photographerId;

    @JsonProperty("avg_color")
    private String avgColor;

    private PexelsSourceModel src;

    private boolean liked;

    private String alt;
}
