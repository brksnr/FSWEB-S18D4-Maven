package com.workintech.s18d1.util;

import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {

    public static void checkName(String name) {
        if(name == null || name.isEmpty()){
            throw new BurgerException("name is null", HttpStatus.BAD_REQUEST);
        }
    }
}
