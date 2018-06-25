package pl.notify.logger;

import java.io.IOException;

public interface Logger {
    public void log(String message);
    public void logFile(String message) throws IOException;
}
