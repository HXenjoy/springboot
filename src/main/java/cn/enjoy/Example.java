package cn.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home() {

        return "Hello World! + v0.2 -- v0.3 merge --guge";

    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
