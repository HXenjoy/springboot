package cn.enjoy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan("cn.enjoy.dao")
@EnableTransactionManagement
@EnableSwagger2
public class App {

    public static void main(String[] args) {
        //启动类
        //定制化
        SpringApplication.run(App.class, args);
    }
}
