package ru.qa.ft.addressbook.tests;

import org.testng.annotations.*;
import ru.qa.ft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Name", "Header", "Footer"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
