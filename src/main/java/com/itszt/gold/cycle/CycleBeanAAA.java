package com.itszt.gold.cycle;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 循环依赖
 */
@Data
@Component
@Getter
public class CycleBeanAAA {

    public CycleBeanAAA() {
        System.out.println("-----------------Bean====CycleBeanAAA--------------------");
    }

    @Autowired
    private CycleBeanBBB cycleBeanBBB;


}
