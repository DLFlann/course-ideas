package com.dlflann.spark.model;

import java.util.List;

public interface CourseIdeaDAO
{
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();

    CourseIdea findBySlug(String slug);
}
