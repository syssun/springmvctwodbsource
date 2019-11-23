package com.sys.main.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestC {
    @Autowired
    testDao testDao;

    @RequestMapping("/tests")
    public String get(){

        return testDao.getUser().toString() ;
    }
}
