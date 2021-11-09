package jp.co.kazono.java.sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerSample {
    private static final Logger logger = LogManager.getLogger(LoggerSample.class);

    public static void main(String[] args) {
        logger.info("This message is INFO level.");
        logger.warn("This message is WARN level.");
        logger.error("This message is ERROR level.");
    }
}
