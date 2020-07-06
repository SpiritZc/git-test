package com.moon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: git-test
 * @Package: com.moon
 * @ClassName: TestController
 * @Author: Administrator
 * @Description:
 * @Date: 2020-7-6 10:09
 * @Version: 1.0
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "HELLO GIT";
    }
}
