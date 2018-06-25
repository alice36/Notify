package pl.notify.logger;

import java.io.IOException;

public interface Logger {
    public void log(String message) throws IOException;
}
