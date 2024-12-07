package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class findContributors {

  @Test
  void firstContributorShouldBeSolntsev() {
    // открыть страничку selenide
    open("https://github.com/selenide/selenide");
    // подвести мышку к первому элементу в области Contributors
    $("div.Layout-sidebar").$(byText("Contributors"))
//            .closest(".BorderGrid-cell")
            .closest("h2").sibling(0).$$("li").first().hover();
    // проверка: в появившемся окошечке (overlay)
    $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));
  }


//  Configuration.headless = false;
//  // открыть страничку selenide
//  open("https://github.com/selenide/selenide");
//  // подвести мышку к первому элементу в области Contributors
//  $(".BorderGrid").$(byText("Contributors"))
//          .closest("div").$("li").hover();
//  // проверка: в появившемся окошечке (overlay)
//  $$(".Popover-message").findBy(visible)
//            .shouldHave(text("Andrei Solntsev"));

}
