package org.example.GradeCalculate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {

    @DisplayName("과목(코스)를 생성한다.")
    @Test
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3, "A+"))
                .doesNotThrowAnyException();
        //assertThatCode() : 객체가 예외없이 잘 처리 되는지
        //doesNOtThrowAnyException() : 해당사항이 맞다면 예외가 발생하지 않는다.(확인용)
    }
}
