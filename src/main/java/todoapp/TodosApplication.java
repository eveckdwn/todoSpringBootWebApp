package todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import todoapp.web.WebMvcConfiguration;

@SpringBootApplication
//  @ComponentScan("todoapp")
//  @SpringBootApplication이(가) 이미 지정된 @ComponentScan을(를) 적용했습니다.
public class TodosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodosApplication.class, args);
    }
}
