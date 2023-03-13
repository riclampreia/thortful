package com.thortful.apichallenge.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PexelsSourceModel {

    private String original;

    private String large2x;

    private String large;

    private String medium;

    private String small;

    private String portrait;

    private String landscape;

    private String tiny;
}
