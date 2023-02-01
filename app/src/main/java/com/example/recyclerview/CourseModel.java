package com.example.recyclerview;

public class CourseModel {

    private String chapter_name;
    private int course_rating;
    private int course_image;

    public CourseModel(String chapter_name, int course_rating, int course_image) {
        this.chapter_name = chapter_name;
        this.course_rating = course_rating;
        this.course_image = course_image;
    }

    public String getChapter_name() {
        return chapter_name;
    }

    public void setChapter_name(String chapter_name) {
        this.chapter_name = chapter_name;
    }

    public int getCourse_rating() {
        return course_rating;
    }

    public void setCourse_rating(int course_rating) {
        this.course_rating = course_rating;
    }

    public int getCourse_image() {
        return course_image;
    }

    public void setCourse_image(int course_image) {
        this.course_image = course_image;
    }
}
