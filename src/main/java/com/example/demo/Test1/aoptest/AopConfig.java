package com.example.demo.Test1.aoptest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.demo.Test1.aoptest")
@EnableAspectJAutoProxy  //使用该注解 开启spring 对 AspectJ 的支持
public class AopConfig {

}
