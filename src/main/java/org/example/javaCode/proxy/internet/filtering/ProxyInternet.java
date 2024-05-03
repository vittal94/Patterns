package org.example.javaCode.proxy.internet.filtering;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private  final Internet internet = new RealInternet();
    private static final List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("banned.com");
    }

    @Override
    public void connectTo(String host) {
        if(bannedSites.contains(host))
            System.out.println("Access denied");
        else
            internet.connectTo(host);
    }
}
