package cucumber8.Base;

import java.io.IOException;

import cucumber8.Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    public static BaseClass base;

    @Before
    public void setUp(Scenario scenario) throws IOException {
        base = new BaseClass();
        base.setupDriver();
        base.launchUrl();
    }

    @After
    public void tearDown(Scenario scenario) {
        base.tearDown();
    }
}
