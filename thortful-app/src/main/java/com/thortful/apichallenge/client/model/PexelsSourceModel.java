package com.thortful.apichallenge.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PexelsSourceModel {

    @JsonProperty("original")
    private String original;

    @JsonProperty("large2x")
    private String large2x;

    @JsonProperty("large")
    private String large;

    @JsonProperty("medium")
    private String medium;

    @JsonProperty("small")
    private String small;

    @JsonProperty("portrait")
    private String portrait;

    @JsonProperty("landscape")
    private String landscape;

    @JsonProperty("tiny")
    private String tiny;
}
