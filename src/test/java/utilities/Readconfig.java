package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\muska\\eclipse-workspace-stackroute\\testngconfigsetup\\src\\test\\resources\\configFile\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String username = prop.getProperty("username");
		System.out.println(username);
		String password = prop.getProperty("password");
		System.out.println(password);
	}

}
