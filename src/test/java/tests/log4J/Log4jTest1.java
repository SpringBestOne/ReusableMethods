package tests.log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTest1 {
private static Logger logger= LogManager.getLogger(Log4jTest1.class.getName());

    @Test
    public void test01() {
        logger.info("LOG INFO");
        logger.debug("LOG DEBUG");
        logger.error("LOG EROR");
        logger.fatal("LOG FATAL");
        logger.warn("LOG WARN");
    }
}



//Eror    Eror ve Fatal gelir
//ınfo   yazarsak   debug getirmez