package com.thortful.apichallenge.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PexelPhotosModel {

    private long id;

    private int width;

    private int height;

    private String url;

    private String photographer;

    private String photographerUrl;

    private long photographerId;

    private String avgColor;

    private PexelSourceModel src;

    private boolean liked;

    private String alt;
}
