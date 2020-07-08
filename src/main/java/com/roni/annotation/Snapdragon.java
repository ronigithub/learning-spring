package com.roni.annotation;

public class Snapdragon implements MobileProcessor
{
    @Override
    public void process() {
        System.out.println("Snapdragon world's best CPU");
    }
}
