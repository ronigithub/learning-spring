package com.roni.annotation2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// You can use multiple package with comma
@ComponentScan(basePackages = "com.roni.annotation2")
public class AppAnnotationConfig2
{

}
