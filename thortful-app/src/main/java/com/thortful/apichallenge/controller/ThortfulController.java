package com.thortful.apichallenge.controller;

import com.thortful.apichallenge.client.PexelClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("thortful")
public class ThortfulController {

    private final PexelClient pexelClient;

    public ThortfulController(PexelClient pexelClient) {
        this.pexelClient = pexelClient
    }

    @ApiOperation(value = "Search photos by several topics")
    public

}
