package com.flexy.model;

import javax.persistence.*;

/**
 * Created by arunv on 15/10/16.
 */
public class Subject {

    private String subjectId;

    private String subjectName;

    private String recommendedBooks;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getRecommendedBooks() {
        return recommendedBooks;
    }

    public void setRecommendedBooks(String recommendedBooks) {
        this.recommendedBooks = recommendedBooks;
    }

}
