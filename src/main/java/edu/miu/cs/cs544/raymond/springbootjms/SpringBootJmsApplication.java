package edu.miu.cs.cs544.raymond.springbootjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBootJmsApplication {

    public static void main(String[] args) {
        System.out.println("App start...");
        System.out.println("App start...")
        SpringApplication.run(SpringBootJmsApplication.class, args);
        System.out.println("App end...");
    }

}
