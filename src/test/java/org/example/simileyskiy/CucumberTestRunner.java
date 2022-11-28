package org.example.simileyskiy;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org.example.simileyskiy")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.example.simileyskiy.hooks,org.example.simileyskiy.stepdefs")

public class CucumberTestRunner {

}

