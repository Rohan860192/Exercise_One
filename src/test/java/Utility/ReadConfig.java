package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() throws Exception {

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String get_AppURL() {

		return prop.getProperty("nop_appURL");
	}

	public String get_userName() {

		return prop.getProperty("userName");
	}

	public String get_password() {

		return prop.getProperty("password");
	}

}
