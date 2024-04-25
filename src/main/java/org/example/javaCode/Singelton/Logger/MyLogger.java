package org.example.javaCode.Singelton.Logger;

public class MyLogger {
    private static String logFile;
    private static MyLogger logger;
    private MyLogger(){
        logFile = "This is logger file \n\n";
    }
    public static synchronized MyLogger getLogger() {
        if (logger == null)
            logger = new MyLogger();
        return logger;
    }
    public void write(String msg) {
        logFile += msg + "\n";
    }

    public String read() {
        return logFile;
    }
}
