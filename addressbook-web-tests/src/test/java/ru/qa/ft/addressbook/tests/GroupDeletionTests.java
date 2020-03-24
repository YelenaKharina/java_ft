package ru.qa.ft.addressbook.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.qa.ft.addressbook.tests.TestBase;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() throws Exception {
    app.goToGroupPage();
    app.selectElement();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
  }

}
