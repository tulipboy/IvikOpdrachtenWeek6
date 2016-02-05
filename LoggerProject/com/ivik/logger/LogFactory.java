package LoggerProject.com.ivik.logger;

/**
 * Created by tulip on 05/02/2016.
 */
public class LogFactory {
    private static LogType logType = LogType.SIMPLE ;
    private Logger logger ;
    public static Logger getLogger() {
        switch ( logType ){
            case SIMPLE :
                return new SimpleLogging();
            case FANCY :
                return new FancyLogging();
        }
        return null ;
    }
    public static void setLogger(LogType logType) {
        LogFactory. logType = logType;
    }
}
