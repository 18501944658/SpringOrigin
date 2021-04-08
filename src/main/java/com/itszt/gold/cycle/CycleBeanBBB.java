package com.itszt.gold.cycle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 循环依赖
 */
@Component
@Data
public class CycleBeanBBB {

    public CycleBeanBBB() {
        System.out.println("-----------------Bean====CycleBeanBBB--------------------");
    }

    @Autowired
    private CycleBeanAAA cycleBeanAAA;
}
