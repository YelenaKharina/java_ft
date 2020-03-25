package ru.qa.ft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends BaseHelper {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    click(By.linkText("home"));
  }

  public void goToAddNewContactPage() {
    click(By.linkText("add new"));
  }

  public void goToGroupPage() {
    click(By.linkText("groups"));
  }

  public void selectElement() {
    click(By.name("selected[]"));
  }
}