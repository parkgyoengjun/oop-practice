package org.example.GradeCalculate;

import java.util.List;

public class GradeCalculator {


    // 이수한 과목들을 전달 받을수있게 만듬
//    private final List<Course> courses;
//    public GradeCalculator(List<Course> courses) {
//        this.courses = courses;
//    }

    private final Courses courses;
    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    /**
     * 학점계산기 구현
     * • 요구사항
     * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계 / 수강신청 총학점 수
     * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
     * • 일급 컬렉션 사용
     */
    public double calculateGrade() { // 전달 받은 이수 과목들로 계산기 돌림
        //(학점수×교과목 평점)의 합계(두개를 해야하니까 명령문 형태??)
//        double multipliedCreditAndCourseGrade = 0;
//        for (Course course : courses) {
//           multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
//              -> 문제점 : GradleCalculator에서 수행하는거라 여러군데에서 쓰여 수정할 일이 생기면 여러군데 수정을 해줘야하는 번거러움
            // -> 해결방법 : Course 에서 수행하도록 위임하게되면 쉬워짐 -->  위임의 위임 이라고 보면 될듯 ex) 계산기껍데기(정보 받는곳) -> 계산기 속(실제 계산이 이루어지는곳) 으로 위임 )


        double totalMutiplyiedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();



    // 수강신청 총학점 수( getCredit 하나만 가져와도 되서 선언문 형태??)
//        int totalCompleteCredit = courses.stream()
//                .mapToInt(courses -> courses.getCredit())
//                .sum();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();


        return totalMutiplyiedCreditAndCourseGrade / totalCompletedCredit;

    }
}
