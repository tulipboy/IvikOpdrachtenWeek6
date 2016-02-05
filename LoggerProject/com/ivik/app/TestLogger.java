package LoggerProject.com.ivik.app;

import LoggerProject.com.ivik.logger.LogFactory;
import LoggerProject.com.ivik.logger.LogType;

/**
 * Created by tulip on 05/02/2016.
 */
public class TestLogger {

    public static void main(String[] args) {
        LogFactory.setLogger(LogType.SIMPLE);
        MyUtils.getInt("Even proberen");
        MyUtils.getInt("234");

        LogFactory.setLogger(LogType.FANCY);
        MyUtils.getInt("even Proberen");
        MyUtils.getInt("432");

        // nu wordt FANCY niet gebruikt, dus er moet een nieuw object gecreëerd worden waarop FANCY aangeroepen wordt:

        MyUtils nuMetFancy = new MyUtils(LogType.FANCY);
        nuMetFancy.
    }
}
