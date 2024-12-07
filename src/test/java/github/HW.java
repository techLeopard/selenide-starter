package github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HW {


    @Test
    void checkSoftAssertionsPageHasCodeSnippet(){
        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".markdown-body").$(byText("Soft assertions")).click();
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $x("//h4[@class='heading-element' and contains(text(), 'JUnit5')]/../following-sibling::div[1]").$("pre").should(exist);
    }

    @Test
    void selenidePageCheck() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".filterable-active").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }


}
