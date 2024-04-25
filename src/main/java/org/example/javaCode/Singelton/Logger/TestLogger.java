package org.example.javaCode.Singelton.Logger;

public class TestLogger {
    public static void run() {
        var logger = MyLogger.getLogger();
        System.out.println(logger.read());
        logger.write("Error line 245");
        logger.write("Suspicious take in line 2454");
        logger.write("Unbelievable asshole in line 24454");
        System.out.println(logger.read());
    }
}
