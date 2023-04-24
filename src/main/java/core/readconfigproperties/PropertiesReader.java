package core.readconfigproperties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesReader {
    private static final String PROPERTIES_FILE_NAME = "runnerConfig.properties";

    private PropertiesReader() {
    }

    public static Properties load() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = PropertiesReader.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME);
            if (input == null) {
                throw new RuntimeException("Unable TO find " + PROPERTIES_FILE_NAME);
            }
            prop.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Error during loading properties. See message for details: " + ex.getMessage());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    throw new RuntimeException("Error during input closing. See message for details: " + e.getMessage());
                }
            }
        }
        return prop;
    }
}
