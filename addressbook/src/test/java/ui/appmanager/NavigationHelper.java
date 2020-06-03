package ui.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupsPage() {
        click(By.linkText("groups"));
    }

    public void goToContactsPage() {
        click(By.linkText("add new"));
    }

    public void goToHomePage() {
        click(By.linkText("home"));
    }
}
