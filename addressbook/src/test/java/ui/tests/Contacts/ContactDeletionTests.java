package ui.tests.Contacts;

import org.testng.annotations.Test;
import ui.tests.TestBase;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContractDeletion () throws Exception{
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.closeAlert();
        app.getNavigationHelper().goToHomePage();
    }
}
