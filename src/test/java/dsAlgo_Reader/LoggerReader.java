package dsAlgo_Reader;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerReader {
	
	  private static final Logger logger = LogManager.getLogger(LoggerReader.class);

	    public static Logger getLogger() {
	        return logger;
	    }
}
