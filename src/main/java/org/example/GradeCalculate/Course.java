package org.example.GradeCalculate;

public class Course {

    private final String subject;   // 과목명
    private final int credit;       // 학점
    private final String grade;     // 성적(A+, A, B+ ....)

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }


    public double multiplyCreditAndCourse() { // (학점수×교과목 평점)의 합계
        return credit * getGradeToNumber();
    }


    public int getCredit() {
        return credit;

    }

    public double getGradeToNumber() {  // 입력받은건 문자열이자만 리턴이 숫자여서
        double grade = 0;
        switch (this.grade) {
            case "A+":
                grade = 4.5;
                break;
            case "A":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C":
                grade = 2.0;
                break;

        }
        return grade;
    }

}
