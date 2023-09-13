package edu.yu.cs.com3800;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public interface LoggingServer {

    default Logger initializeLogging(String fileNamePreface) throws IOException {
        return initializeLogging(fileNamePreface,false);
    }
    default Logger initializeLogging(String fileNamePreface, boolean disableParentHandlers) throws IOException {
          //.....
        return createLogger(loggerName,fileNamePreface,disableParentHandlers);
    }

    static Logger createLogger(String loggerName, String fileNamePreface, boolean disableParentHandlers) throws IOException {
          //...........
    }
}
