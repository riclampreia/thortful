package com.thortful.apichallenge.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PexelsModel {

    @JsonProperty("total_results")
    private long totalResults;

    @JsonProperty("page")
    private int page;

    @JsonProperty("per_page")
    private int perPage;

    @JsonProperty("photos" )
    private PexelsPhotosModel[] photos;

    @JsonProperty("next_page")
    private String nextPage;
}
