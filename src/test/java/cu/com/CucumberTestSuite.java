package cu.com;

import io.cucumber.core.options.Constants;
import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "net.serenitybdd.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "cu.com.steps")
@ConfigurationParameter(
        key = Constants.PLUGIN_PROPERTY_NAME,
        value = "pretty, json:target/cucumber-report.json, net.serenitybdd.cucumber.core.plugin.SerenityReporterParallel"
)
@IncludeTags("Reg")
public class CucumberTestSuite {
}
