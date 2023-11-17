package org.runnerclass;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\MAVEN PROJECT\\testNG\\cucumberDemo\\src\\test\\resources\\Featurefile\\fb.feature",glue="org.stepdifination")
public class Runnerclass {

}
