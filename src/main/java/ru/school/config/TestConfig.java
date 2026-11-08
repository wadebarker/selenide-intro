package ru.school.config;

public class TestConfig {

    private TestConfig() {
    }

    public static final String BASE_URL = System.getProperty("base.url", "http://2.59.41.2:6700");

    public static final String BROWSER = System.getProperty("browser", "chrome");

    public static final boolean HEADLESS = Boolean.parseBoolean(
            System.getProperty("headless", "false")
    );
}
