package com.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: git-test
 * @Package: com.moon
 * @ClassName: GitApplication
 * @Author: Administrator
 * @Description:
 * @Date: 2020-7-2 12:57
 * @Version: 1.0
 */
@EnableAutoConfiguration
@RestController
public class GitApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GitApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GitApplication.class);
    }
}
