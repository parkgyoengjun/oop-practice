package org.example.GradeCalculate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 학점계산기 구현
 * • 요구사항
 * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계 / 수강신청 총학점 수
 * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * • 일급 컬렉션 사용
 */
public class GradeCalculatorTest {

    // 학점계산기 도메인 : 이수한 과목(객체지향프로그래밍, 자료구조, 중국어회화), 학점계산기
    // 객체지향프로그래밍, 자료구조, 중국어회화 --> 과목(코스) 클래스

    /**
     * 핵심포인트 (일급컬렉션을 이용해서 )
     * 객체들끼리 메세지를 전달틀 통해서 한 객체가 다 처리하는것이 아닌 해당 값을 가진 객체에게
     * 작업을 위임하고 이를 통해 최종적인 결과를 얻어내는 객체지향적 프로그래밍
     */
    // 이수한 과목을 전달하여 평균학점 계산 요청 ---> 학점 계산기 ---> (학점수×교과목 평점)의 합계 ---> 과목(코스) 일급컬렉션
    //                                                   --->  수강신청 총학점 수        ---> 과목(코스) 일급컬렉션

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculatorGradeTest() {

        // 전달할 이수과목들 설정
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        // GradeCalculator에 courser(이수과목) 을 넘겨줌
        GradeCalculator gradleCalculator = new GradeCalculator(courses);

        // 학점계산 된 결과를 받음
        double gradeResult = gradleCalculator.calculateGrade();

        // 계산 결과를 비교
        assertThat(gradeResult).isEqualTo(4.5);

    }
}