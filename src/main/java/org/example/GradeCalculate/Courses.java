package org.example.GradeCalculate;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {


//        double multipliedCreditAndCourseGrade = 0;
//        for (Course course : courses) {
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourse();
//
//        }
//        return multipliedCreditAndCourseGrade;

        return courses.stream()
                .mapToDouble(Course :: multiplyCreditAndCourse)
                .sum();


    }

    public int calculateTotalCompletedCredit() {
                return courses.stream()
                .mapToInt(Course :: getCredit)
                .sum();
    }
}
