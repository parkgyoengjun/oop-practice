package org.example.cook;

import org.assertj.core.api.Assertions;
import org.example.cook.Cook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookTest {
    @DisplayName("요리를 생성한다.")
    @Test
    void createCookTest() {
        Assertions.assertThatCode(()->new Cook("만두",5000))
                .doesNotThrowAnyException();
        // -> 요리를 생성하면 어떠한 exception도 발생하지 않는다는 의미
    }
}
