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
    int before = app.getGroupHelper().getGroupCount();
    app.getNavigationHelper().selectElement();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("name1", "header2", "footer3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before);
  }
}
