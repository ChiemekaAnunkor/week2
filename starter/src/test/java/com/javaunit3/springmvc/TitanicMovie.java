package com.javaunit3.springmvc;

import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements Movie {

    @Override
    public String title() {
        return "Titanic";
    }

    @Override
    public String maturity() {
        return "PG-13";
    }

    @Override
    public String genre() {
        return "Romance";
    }
}
