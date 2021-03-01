package com.test.controllerl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : LocalController
 * @Description :
 * @Author : caoxuecheng
 * @Date: 2021-03-01 16:54
 */

    @Slf4j
    @RestController
    @RequestMapping("/local")
    public class LocalController {

        @RequestMapping("/queryUser")
        public String queryUser() {
            log.info("zuul->queryUser");
            return "zuul->queryUser";
        }
    }

