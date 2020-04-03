package ru.qa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();
    //проверка существования групп, при отсутствии группа создается
    if (! app.getNavigationHelper().isThereAElement()) {
      app.getGroupHelper().createGroup(new GroupData("name", "header", "footer"));
    }
    int before = app.getNavigationHelper().getElementCount();
    app.getNavigationHelper().selectElement(before - 1);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("new_name", "new_header", "new_footer"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getNavigationHelper().getElementCount();
    Assert.assertEquals(after, before + 1);
  }
}
