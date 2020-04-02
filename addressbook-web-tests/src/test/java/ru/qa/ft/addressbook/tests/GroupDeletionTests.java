package ru.qa.ft.addressbook.tests;

import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.GroupData;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    //проверка существования групп, при отсутствии группа создается
    if (! app.getNavigationHelper().isThereAElement()) {
      app.getGroupHelper().createGroup(new GroupData("name", "header", "footer"));
    }
    app.getNavigationHelper().selectElement();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }
}
