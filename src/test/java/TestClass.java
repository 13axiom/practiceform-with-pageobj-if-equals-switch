import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestClass {

    @Test
    public void testVoid() {
        open("https://github.com");
        $(".application-main ").$(byText("Where the world builds software")).shouldHave(text("Where the world builds software"));
    }

}
