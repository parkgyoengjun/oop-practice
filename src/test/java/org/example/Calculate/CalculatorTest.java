package org.example.Calculate;

import org.example.end.Calculator;
import org.example.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

/**
 요구사항
 • 간단한 사칙연산을 할 수 있다.
 • 양수로만 계산할 수 있다.
 • 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 • MVC패턴(Model-View-Controller) 기반으로 구현한다
 */
public class CalculatorTest {

      // 1 + 2 ----> Calculator
      //   3   <----
//    @Test
//    @DisplayName("덧셈 연산을 수행한다.")
//    void additionTest() {
//
//        int result = Calculator.calculate(1, "+", 2);
//        assertThat(result).isEqualTo(3);
//    }
//
//    @Test
//    @DisplayName("뺄셈 연산을 수행한다.")
//    void substrationTest() {
//
//        int result = Calculator.calculate(1, "-", 2);
//        assertThat(result).isEqualTo(-1);
//    }
//    @ParameterizedTest
//    @MethodSource("formulaAndResult")
//    @DisplayName("뺄셈 연산을 수행한다.")
//    void substrationTest(int operand1,String operator, int operand2, int result) {
//
//        int calculateResult = Calculator.calculate(operand1, operator, operand2);
//        assertThat(calculateResult).isEqualTo(result);
//    }

    @ParameterizedTest
    @MethodSource("formulaAndResult") // formulaAndResult를 소스로 가진다.
    @DisplayName("덧셈 연산을 수행한다.")
    void calculateTest(int operand1, String operator, int operand2, int result) {

        int calculateResult = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));
        assertThat(calculateResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                Arguments.arguments(1, "+", 2, 3),
                Arguments.arguments(1, "-", 2, -1),
                Arguments.arguments(4, "*", 2, 8),
                Arguments.arguments(4, "/", 2, 2)
        );
    }

//    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgumentException 예외를 발생시킨다.")
//    @Test
//    void calculateExceptionTest() {
//        Assertions.assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("0으로 나눌수 없습니다.");
//
//    } --> PositiveNumber 에서 이미 0또는 음수를 받아들일수 없기 때문에 필요가 없는 부분

}