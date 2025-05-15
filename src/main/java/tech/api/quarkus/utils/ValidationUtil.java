package tech.api.quarkus.utils;

public class ValidationUtil {

    public static String getSimpleProperty(String path){
        String[] parts = path.split("\\.");
        return parts[parts.length -1];
    }
}
