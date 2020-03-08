package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    private static Logger logger = LogManager.getLogger(Log.class);

    public static void start(String s){
        logger.info("Scenario start point: " + s);
    }

    public static void info(String s){
        logger.info(s);
    }

    public static void warn(String s){
        logger.warn(s);
    }

    public static void error(String s){
        logger.error(s);
    }
}
