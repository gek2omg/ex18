package com.example.ex18;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ex18Application {

    public static void main(String[] args) {
        SpringApplication.run(Ex18Application.class, args);
    }

    // DTO 또는 객체를 JSON 으로 바로 변환하기위해 필요
    @Bean
    Hibernate5Module hibernate5Module() {
        return new Hibernate5Module();
    }
}
