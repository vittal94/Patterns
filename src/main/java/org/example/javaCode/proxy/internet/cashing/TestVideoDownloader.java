package org.example.javaCode.proxy.internet.cashing;

public class TestVideoDownloader {
    public static void run() {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("terminator");
        videoDownloader.getVideo("terminator");
        videoDownloader.getVideo("fifth element");
    }
}
