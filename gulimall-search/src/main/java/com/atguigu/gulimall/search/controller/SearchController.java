package com.atguigu.gulimall.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: TODO
 * @ClassName SearchContrlloer
 * @Author 南风过境
 * @Date 2023-12-23 14:52
 * @Version V1.0
 **/
@Controller
public class SearchController {

    @GetMapping("list.html")
    public String listPage() {
        return "list";
    }
}
