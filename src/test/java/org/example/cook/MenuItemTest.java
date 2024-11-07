package org.example.cook;

import org.assertj.core.api.Assertions;
import org.example.cook.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuItemTest {
    @DisplayName("메뉴항목을 생성한다.")
    @Test
    void createMenuTest() {
        Assertions.assertThatCode(()->new MenuItem("만두",5000))
                .doesNotThrowAnyException();
    }
}
