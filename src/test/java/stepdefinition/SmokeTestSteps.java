package stepdefinition;

import pages.StartPage;

public class SmokeTestSteps {

    private StartPage startPage;

    public void i_open_start_page() {
        startPage.open();
    }

    public void i_should_see_header_text(String title) {
        startPage.should_see_header_text(title);
    }



}
