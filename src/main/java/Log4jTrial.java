import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2019/5/16.
 */

public class Log4jTrial {
    private static final Logger logger = LogManager.getLogger(Log4jTrial.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.error("error level");
        logger.fatal("fatal level");

    }
}
