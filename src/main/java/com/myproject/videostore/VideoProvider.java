package com.myproject.videostore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class VideoProvider {
    @Autowired
    private VideoStore video;

    public InputStream getContent() {
        return video.getContent(new Video(1L));
    }

}
