package Singletony;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigHelper {

    private static ConfigHelper configHelper;

    private static Map<String, String> propertyMap = new HashMap<String, String>();

    private ConfigHelper(){};

    public static ConfigHelper getConfig(){

        if (configHelper == null){
            configHelper = new ConfigHelper();
        }
        try {
            Files.readAllLines(Paths.get("config.txt"))
                    .forEach(value -> {
                        String[] array = value.split("=");
                        propertyMap.put(array[0], array[1]);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return configHelper;
    }

    public String getProperty(String key){
        return propertyMap.get(key);
    }
}
