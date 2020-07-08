package com.roni;

import com.roni.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnnotation {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppAnnotationConfig.class);

        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
