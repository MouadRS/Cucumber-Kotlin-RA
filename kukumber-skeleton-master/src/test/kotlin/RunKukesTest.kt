

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith


@RunWith(Cucumber::class)
@CucumberOptions(
        features = ["src/test/resources/cucumber/features"],
        tags = ["@testthis"],
        plugin=[
				"pretty",
				"html:test-output/cucumberreport1"])


class RunKukesTest

