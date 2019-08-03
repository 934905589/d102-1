package org.java.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 老哥
 * @Date: 2019/8/3 11:55
 * @Description: 这是哥上课用的案例
 */
@RestController
public class GitController {

    @GetMapping
    public String init(){
        return "hello...12345";
    }
}
