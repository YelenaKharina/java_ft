package ru.qa.ft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    //проверяем наличие таблицы
    //если выполняется, то выполняем выход из метода
    //если нет, то совершаем клик для перехода на домашнюю страницу
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
  }

  public void goToAddNewContactPage() {
    click(By.linkText("add new"));
  }

  public void goToGroupPage() {
    //проверяем наличие заголовка, имя заголовка и наличие кнопки создания новой группы
    //если выполняется, то выполняем выход из метода
    //если нет, то совершаем клик для перехода на страницу с группами
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
      return;
    }
    click(By.linkText("groups"));
  }

  public void selectElement() {
    click(By.name("selected[]"));
  }
}
