package ru.qa.ft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

  public NavigationHelper(WebDriver wd) {
    super(wd);
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

  public void selectElement(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public boolean isThereAElement() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getElementCount() {
    return wd.findElements(By.name("selected[]")).size();
  }
}
