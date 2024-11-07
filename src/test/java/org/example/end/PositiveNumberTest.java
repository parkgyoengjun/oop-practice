package org.example.end;

import org.assertj.core.api.Assertions;
import org.example.calculate.PositiveNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositiveNumberTest {

//    @Test
//    void createTest() {
//
//        Assertions.assertThatCode(() -> new PositiveNumber(0))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("0또는 음수를 전달할 수 없습니다.");
//    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void createTest(int value) {
        Assertions.assertThatCode(() -> new PositiveNumber(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0또는 음수를 전달할 수 없습니다.");
    }
}
