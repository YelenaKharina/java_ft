package ru.qa.ft.addressbook.tests;

import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("name", "header", "footer"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
