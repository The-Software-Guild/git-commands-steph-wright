package com.example.client;

import com.example.persistence.StudentDao;
import com.example.persistence.StudentDaoImpl;
import com.example.presentation.StudentPresentation;
import com.example.presentation.StudentPresentationImpl;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

    @Bean (name="persistence")
    public StudentDao getPersistence() {
        return new StudentDaoImpl();
    }

    @Bean (name = "service")
    public StudentService getService() {
        return new StudentServiceImpl(getPersistence());
    }

    @Bean (name = "presentation")
    public StudentPresentation getPresentation() {
        return new StudentPresentationImpl(getService());
    }
}
