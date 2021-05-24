package com.itszt.gold.bean20210117;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl  implements StudentService {





    public void eat(String a) {
        System.out.println("===========================StudentServiceImpl.eat");
    }

    public String sleep(List b) {

        System.out.println("====================StudentServiceImpl.sleep");

        return "====================StudentServiceImpl.sleep";
    }
}
