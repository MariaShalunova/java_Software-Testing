package ui.tests.Contacts;

import org.testng.annotations.Test;
import ui.model.ContactData;
import ui.tests.TestBase;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContractModification() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData(
                "test", "test", "test",
                "test", "test", "test", "test",
                "test", "test", "mobile", "test",
                "test", "test", "test", "test",
                "test", "10", "February", "2000",
                "13", "February", "2000", "test", "test",
                null, "test"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactsPage();
    }
}
