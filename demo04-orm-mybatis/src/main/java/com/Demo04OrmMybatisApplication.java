package com;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.tk.mapper")
//@MapperScan("com.dao")
public class Demo04OrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo04OrmMybatisApplication.class, args);
    }

}
