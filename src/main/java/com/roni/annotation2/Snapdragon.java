package com.roni.annotation2;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor
{
    @Override
    public void process() {
        System.out.println("Snapdragon world's best CPU");
    }
}
