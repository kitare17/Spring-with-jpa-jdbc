package com.kitare.jpa.kitare.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBC {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    String query= """
            INSERT INTO COURSE(ID,NAME,AUTHOR) VALUES('12345','SPRING COURSE','KITARE')
            """;
    public void addNewCourse(){
        jdbcTemplate.update(query);
    }
}
