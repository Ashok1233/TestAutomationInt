package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.Keys;

public class ConfigReader {
	
	private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\TestAutomation\\SeleniumTest\\src\\com\\fastlink\\propertyFile\\config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to read config.properties");
        }

}
    
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static int getIntProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }

	public static CharSequence getProperty(String string, Keys enter) {
		String result=string + enter.toString();
		return result;
	}

	
}
