package ru.qa.ft.addressbook.tests;

import org.testng.Assert;
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
    int before = app.getNavigationHelper().getElementCount();
    app.getNavigationHelper().selectElement(before - 1); //удалить первую групп (0), удалить последнюю (before - 1)
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getNavigationHelper().getElementCount();
    Assert.assertEquals(after, before + 1);
  }
}
