package idu.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
//데이터베이스 설정하지말라는 의미
public class BootThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootThymeleafApplication.class, args);
	}

}
