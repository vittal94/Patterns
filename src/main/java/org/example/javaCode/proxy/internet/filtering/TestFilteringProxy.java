package org.example.javaCode.proxy.internet.filtering;

public class TestFilteringProxy {
    public static void run(){
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");
    }
}
