package LoggerProject.com.ivik.logger;

/**
 * Created by tulip on 01/02/2016.
 */
class SimpleLogging implements Logger{

    @Override
    public void debug(String msg) {
        System. out .println( "DEBUG: " + msg);
    }

    @Override
    public void error(String msg) {
        System. out .println( "ERROR: " + msg);
    }

    @Override
    public void info(String msg) {
        System. out .println( "INFO: " + msg);
    }

    @Override
    public void warn(String msg) {
        System. out .println( "WARN: " + msg);
    }
}
