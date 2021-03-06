package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final Logger LOG = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        String message = "Hello World ";

        LOG.info(message + "we are doing log4j2");
        LOG.debug(message + "Hello");
        LOG.fatal(message + "we are doing log4j2");
        LOG.error(message + "working on dev branch");
        LOG.error(message + "learning git");
    }
}
