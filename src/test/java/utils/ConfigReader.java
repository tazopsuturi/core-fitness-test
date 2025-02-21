package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ConfigReader {
	public static Config config;
	
	static {
		try {
			loadConfig();
		} catch (IOException e) {
			throw new RuntimeException("Failed to load config file", e);
		}
	}
	
	public static void loadConfig() throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		config = objectMapper.readValue(new File("src/test/resources/config.json"), Config.class);
	}
	
	public static class User {
		public String email;
		public String password;
	}
	
	public static class Blog {
		public String enTitle;
		public String kaTitle;
		public String enDescription;
		public String kaDescription;
		public String category;
	}
	
	public static class Config {
		public User user;
		public Blog blog;
	}
	
}
