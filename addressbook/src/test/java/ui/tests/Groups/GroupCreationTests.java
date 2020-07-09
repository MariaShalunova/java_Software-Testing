package ui.tests.Groups;

import org.testng.annotations.*;
import ui.model.GroupData;
import ui.tests.TestBase;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().createGroup(new GroupData("test", null, null));
    }

}
