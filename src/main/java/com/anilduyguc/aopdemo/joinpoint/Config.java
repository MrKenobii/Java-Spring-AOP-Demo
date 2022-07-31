package com.anilduyguc.aopdemo.joinpoint;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.anilduyguc.aopdemo.joinpoint")
public class Config {
}
