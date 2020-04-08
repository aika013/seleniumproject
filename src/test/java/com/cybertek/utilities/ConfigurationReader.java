package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        try {FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            //file Reader s byte code
            //fileInputStream here is our configFile as bite code
            properties = new Properties();

            //properties file can read byte code so we need the file as byte code
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(ConfigurationReader.getProperty("browser"));
    }
}
