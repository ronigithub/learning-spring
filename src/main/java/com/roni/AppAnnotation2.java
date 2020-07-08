package com.roni;

import com.roni.annotation2.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Spring Core Annotation
public class AppAnnotation2 {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppAnnotationConfig2.class);

        Samsung a30 = factory.getBean(Samsung.class);
        a30.config();

    }
}
