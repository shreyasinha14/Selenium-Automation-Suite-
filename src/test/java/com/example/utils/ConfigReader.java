package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties props = new Properties();

    static {
        try (InputStream input = new FileInputStream("config/test-config.properties")) {
            props.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Failed to load config", ex);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
    
    public static String get(String key, String defaultValue) {
        return props.getProperty(key, defaultValue);
    }
}
