package practica.konecta.web.Runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "practica.konecta.web.StepDefinitions",
        features = "src/test/resources/features/",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Login",
        monochrome = true

)
public class PrincipalRunner {
}
