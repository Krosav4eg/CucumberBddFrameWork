package core.utils.propReader;


import org.aeonbits.owner.Config;

/**
 * Following interface specifies the policy for loading the properties files.
 * By default the first available properties file specified by Config.Sources.
 */
@Config.Sources({"classpath:runnerConfig.properties"})
@SuppressWarnings("checkstyle:MethodName")
public interface PropsConfig extends Config {

    @Config.Key("base.browser")
    String BASE_BROWSER();

    @Config.Key("base.url")
    String BASE_URL();

    @Config.Key("waiting.timeout")
    String WAITING_TIMEOUT();
}