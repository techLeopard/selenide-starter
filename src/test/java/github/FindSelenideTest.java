package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideOnGitHub() {
        // открыть страничку
        open("https://github.com");
        // раскрыть поле поиска кликом
        $(".header-search-button").click();
        // ввести в поле поиска selenide и нажать на enter
        $("#query-builder-test").setValue("selenide").pressEnter();
        // выбрать первый найденный проект из списка (кликнуть)
        $("[data-testid=results-list] a:first-of-type").click();
        // проверка: в заголовке встречается selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }


    // .classname, #id, [], a[href=abc].red

    // ARRANGE
    // ACT
    // ASSERT


    // ARRANGE
    // ACT
    // ACT
    // ASSERT
    // ACT
    // ASSERT
}
