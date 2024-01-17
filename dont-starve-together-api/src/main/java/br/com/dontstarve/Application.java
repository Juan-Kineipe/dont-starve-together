package br.com.dontstarve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public String PORT = System.getenv("PORT");

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
