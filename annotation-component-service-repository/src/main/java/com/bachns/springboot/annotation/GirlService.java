package com.bachns.springboot.annotation;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public Girl getRandomGirl() {
        String name = randomGirlname(10);
        return girlRepository.getGirlByName(name);
    }

    private String randomGirlname(int length) {
        return RandomStringUtils.randomAlphanumeric(length).toLowerCase();
    }
}
