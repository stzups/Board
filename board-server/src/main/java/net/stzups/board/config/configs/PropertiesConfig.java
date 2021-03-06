package net.stzups.board.config.configs;

import net.stzups.board.config.ConfigProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Loads a file that should be formatted as a Java {@link Properties} file, and adds any values defined in that value.
 * This still works if the file does not exist or no values are present in the file.
 */
public class PropertiesConfig implements ConfigProvider {
    private Properties properties;

    /**
     * Loads .properties formatted file from given path, only if it exists.
     * @param path path to the .properties file
     */
    public PropertiesConfig(String path) throws IOException {
        properties = new Properties();
        File file = new File(path);
        if (file.exists()) {//load user defined config if created
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                properties.load(fileInputStream);
            }
        }
    }

    @Override
    public String get(String key) {
        return properties.getProperty(key);
    }
}
