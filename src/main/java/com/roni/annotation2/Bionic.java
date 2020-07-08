package com.roni.annotation2;

import org.springframework.stereotype.Component;

@Component
public class Bionic implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("Bionic is world's best CPU");
    }
}
