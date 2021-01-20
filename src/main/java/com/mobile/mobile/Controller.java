package com.mobile.mobile;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @RequestMapping("/test")
    public Integer getTest() {
        return 1;
    }

}
