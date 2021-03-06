package com.example.app1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
@ImportResource("classpath:app1-context.xml")
public class App1Application {

    public static void main(String[] args) {
        Banner banner = new MyBanner();
        SpringApplication springApplication = new SpringApplication(App1Application.class);
        springApplication.setBanner(banner);
        springApplication.setBannerMode(Banner.Mode.LOG);
        springApplication.run(args);
//        SpringApplication.run(App1Application.class, args);
    }


    private static class MyBanner implements Banner {
        @Override
        public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
            out.println("Madafakaa");
        }
    }

}
