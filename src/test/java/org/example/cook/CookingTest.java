package org.example.cook;

import org.assertj.core.api.Assertions;
import org.example.cook.Cook;
import org.example.cook.Cooking;
import org.example.cook.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookingTest {
    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        // 1. 음식 만들기 클래스
        Cooking cooking = new Cooking();

        // 2. 주문 받은 메뉴를 생성
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        // 3. 음식 만들기에 주문 받은 메뉴를 넣고 음식 클래스에 있는 음식이랑 확인
        Cook cook = cooking.makeCook(menuItem);

        Assertions.assertThat(cook).isEqualTo(new Cook("돈까스",5000));
        // 객체들끼리 비교할때는 equlas,hashcode가 있어야함
    }


}
