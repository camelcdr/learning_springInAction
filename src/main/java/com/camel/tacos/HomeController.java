package com.camel.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author camel
 * @date 2020/07/04 3:39
 **/
@Controller
public class HomeController {

    @GetMapping
    public String home() {
        return "home";
    }
}
