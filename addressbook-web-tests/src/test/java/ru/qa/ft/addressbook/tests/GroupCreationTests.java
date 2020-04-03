package ru.qa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();

    int before = app.getNavigationHelper().getElementCount();
    app.getGroupHelper().createGroup(new GroupData("name", "header", "footer"));
    int after = app.getNavigationHelper().getElementCount();
    Assert.assertEquals(after, before + 1);
  }
}
