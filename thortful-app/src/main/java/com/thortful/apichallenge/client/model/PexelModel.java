package com.thortful.apichallenge.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PexelModel {

    private long totalResults;

    private int page;

    private int perPage;

    private PexelPhotosModel[] photos;

    private String nextPage;
}
