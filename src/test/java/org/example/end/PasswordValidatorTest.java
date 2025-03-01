package org.example.end;

import org.example.end.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 요구사항
 * • 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * • 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생
 * 시킨다.
 * • 경계조건에 대해 테스트 코드를 작성해야 한다
 */
public class PasswordValidatorTest {


    @Test
    @DisplayName("비밀번호가 최소 8자이상, 12자 이하면 예외가 발생하지 않는다.")
    void validatePasswordTest(){
        assertThatCode(() -> PasswordValidator.validate("serverwiza"))
                .doesNotThrowAnyException();
    }

    @ValueSource(strings = {"aabbcce", "aabbccddeeffg"})
    @ParameterizedTest
    @DisplayName("비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생")
    void validatePasswordTest2(String password) {

        assertThatCode(() -> PasswordValidator.validate("aabb"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야한다.");
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.")
    @ParameterizedTest
    @ValueSource(strings = {"aabbcce","aabbccddeeffg"})
    void validatePasswordTest3(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야한다.");
    }


}
