package com.runner;


import org.baseclass.Utility_Files;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		( features = "./Feature",
		glue = "com.step_definition",
		monochrome = true,
		publish = true,
		plugin = {"html:Reports/yourlogo.html"}
//		tags = ("@dresses")
				
		)

public class Your_Logo_Runner_BDD {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = Utility_Files.get_Browser("chrome");
		Utility_Files.run_Url("yourlogo");
	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
