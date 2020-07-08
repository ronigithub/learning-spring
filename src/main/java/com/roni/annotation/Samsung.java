package com.roni.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung
{
    @Autowired
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config() {
        System.out.println("Dual Core, 4gb Ram, 12MP Camera");
        cpu.process();
    }
}
