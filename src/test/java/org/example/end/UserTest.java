package org.example.end;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class UserTest {

    @Test
    @DisplayName("패스워드를 초기화한다")
    void passwordTest() {
        //given
        User user = new User();

        //when
        user.initPasssword(new CorrectFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNotNull();

    }

    @Test
    @DisplayName("패스워드가 요구사항에 부합되지 않아 초기화가 되지않는다.")
    void passwordTest2() {
        //given
        User user = new User();

        //when
        user.initPasssword(new WrongFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNull();

    }

}