package com.thortful.apichallenge;

import org.springframework.boot.SpringApplication;

public class Main {

    private Main() {
        //empty on purpose
    }

    public static void main(String[] args) {
        SpringApplication.run(RootConfiguration.class, args);
    }
}
