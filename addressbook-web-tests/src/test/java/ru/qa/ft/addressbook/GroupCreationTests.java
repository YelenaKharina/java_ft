package ru.qa.ft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Name", "Header", "Footer"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
