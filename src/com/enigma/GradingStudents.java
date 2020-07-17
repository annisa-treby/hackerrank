package com.enigma;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public List<Integer> gradingStudent(List<Integer> grades){
        List<Integer> finalGrades = new ArrayList<>();

        for (int i = 0; i < grades.size() ; i++) {
            if (grades.get(i) < 38){
                finalGrades.add(grades.get(i));
            } else {
                int rest = grades.get(i) % 5;
                int grade = grades.get(i)+(5-rest);
                int difference = grade - grades.get(i);
                if (difference < 3){
                    finalGrades.add(grade);
                } else {
                    finalGrades.add(grades.get(i));
                }
            }
        }
        return finalGrades;
    }
}
