package com.maven05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.*;

@RestController
//@ConfigurationProperties(prefix = "xxx")
@RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
public class HelloController {

    @Value("${defaultSize}")
    private String Size;

    // 注入properties的值
    @Value("${contentSize}")
    private String contentSize;

    // 直接注入PersonProperties的值
    @Autowired
    PersonProperties personProperties;

    // /hello/say
    // /hi/say
    // /hello/sayhello
    // /hi/sayhello
    // 以上url都可以访问到
    @RequestMapping(value = {"/say", "/sayhello"}, method = RequestMethod.GET)
    public String Say() {
        return "hello word " + contentSize + "  " + personProperties.getTitle();
    }

    @RequestMapping(value = {"/getById/{id}"}, method = RequestMethod.GET)
    public String getById(@PathVariable("id") Integer id) {
        return "hello word " + id;
    }

    //在？后面哪参数
    @RequestMapping(value = {"/getById"}, method = RequestMethod.GET)
    public String getById1(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "hello word " + myId;
    }

    @GetMapping
    @PostMapping
    public String getById2(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "hello word " + myId;
    }
}
