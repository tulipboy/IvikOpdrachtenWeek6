package LoggerProject.com.ivik.app;

import LoggerProject.com.ivik.logger.LogFactory;

import LoggerProject.com.ivik.logger.Logger;

/**
 * Created by tulip on 05/02/2016.
 */
 public class MyUtils {
        static Logger logger = LogFactory.getLogger ();
        public static boolean getInt(String intString) {
            boolean ok = false ;
            logger.info( " checking string " + intString);
            try {
                int value = Integer. parseInt (intString);
                ok = true ;
                logger.debug("Alles oke");
            } catch (NumberFormatException e) {
                logger.error(e.getMessage());
            }
            return ok;
        }
    }

