package com.kitare.jpa.kitare.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBC courseJDBC;

    @Override
    public void run(String... args) throws Exception {
        courseJDBC.addNewCourse();
    }
}
