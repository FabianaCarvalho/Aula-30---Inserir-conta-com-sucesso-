package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "src/main/resources/Features/InserirConta.feature",
glue = "Steps",
tags = {"~@ignore"},
plugin = {"pretty"},
monochrome = false,
//esse plugin irá juntar o nome do metodo sem usar underline
snippets = SnippetType.CAMELCASE,
dryRun = false,
strict = false

)

public class Runner {

}
