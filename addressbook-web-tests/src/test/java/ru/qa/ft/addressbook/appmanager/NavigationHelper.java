package ru.qa.ft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void returnToHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  public void goToAddNewContactPage() {
    wd.findElement(By.linkText("add new")).click();
  }

  public void goToGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }
}
