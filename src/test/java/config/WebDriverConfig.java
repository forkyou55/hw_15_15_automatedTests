package config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://www.sportsdirect.com/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remote")
    String getRemote();

    @Key("username")
    String username();

    @Key("password")
    String password();


}