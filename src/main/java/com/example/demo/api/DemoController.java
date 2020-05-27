package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 测试接口
 */
@RestController
@RequestMapping(value = "/app")//定义请求地址
public class DemoController {
    @RequestMapping(method = RequestMethod.GET,value = "/jiSuanQi")
    public String jiSuanQi(HttpServletResponse response){
        String s="{\n" +
                "  \"name\": \"lihongxiang\",\n" +
                "  \"sex\": 18\n" +
                "}";
        return s;

    }
    @RequestMapping(method = RequestMethod.GET,value = "/jiSuanQi2")
    public String jiSuanQi2(HttpServletResponse response){
        String q="[{\n" +
                "  \"name\": \"lihongxiang\",\n" +
                "  \"sex\": 18\n" +
                "},\n" +
                "{\n" +
                "  \"name\": \"wang\",\n" +
                "  \"sex\": 17\n" +
                "},\n" +
                "{\n" +
                "  \"name\": \"zhao\",\n" +
                "  \"sex\": 16\n" +
                "}]";
        return q;

    }

}
