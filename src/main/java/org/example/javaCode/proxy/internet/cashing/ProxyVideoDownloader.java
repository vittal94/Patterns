package org.example.javaCode.proxy.internet.cashing;

import java.util.HashMap;

public class ProxyVideoDownloader implements VideoDownloader{
    private final RealVideoDownloader videoDownloader;
    private final HashMap<String,Video> cashedVideos;

    public ProxyVideoDownloader() {
        videoDownloader = new RealVideoDownloader();
        cashedVideos = new HashMap<>();
    }
    @Override
    public Video getVideo(String videoName) {
        return cashedVideos.computeIfAbsent(
                videoName,(s -> videoDownloader.getVideo(videoName)));
    }
}
