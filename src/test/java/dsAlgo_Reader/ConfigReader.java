package dsAlgo_Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;
	private static final org.apache.logging.log4j.Logger logger = LoggerReader.getLogger();
	
    static {
        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream("Utilities/config.properties");
            properties.load(file);
            file.close();
            logger.info("Loaded configuration from config.properties");
        } catch (IOException e) {
        	logger.error("Failed to load config.properties file: " + e.getMessage());
            throw new RuntimeException("Failed to load config.properties file: " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}

